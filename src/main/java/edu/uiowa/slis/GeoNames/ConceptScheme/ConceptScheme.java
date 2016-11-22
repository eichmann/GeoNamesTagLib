package edu.uiowa.slis.GeoNames.ConceptScheme;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class ConceptScheme extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ConceptScheme currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptScheme.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String hasTopConcept = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ConceptSchemeIterator theConceptSchemeIterator = (ConceptSchemeIterator) findAncestorWithClass(this, ConceptSchemeIterator.class);

			if (theConceptSchemeIterator != null) {
				subjectURI = theConceptSchemeIterator.getSubjectURI();
				label = theConceptSchemeIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Code.CodeInSchemeIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Code.CodeInSchemeIterator)this.getParent()).getInScheme();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Concept.ConceptTopConceptOfIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Concept.ConceptTopConceptOfIterator)this.getParent()).getTopConceptOf();
			}

			edu.uiowa.slis.GeoNames.Code.CodeInSchemeIterator theCodeInSchemeIterator = (edu.uiowa.slis.GeoNames.Code.CodeInSchemeIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Code.CodeInSchemeIterator.class);

			if (subjectURI == null && theCodeInSchemeIterator != null) {
				subjectURI = theCodeInSchemeIterator.getInScheme();
			}

			edu.uiowa.slis.GeoNames.Concept.ConceptTopConceptOfIterator theConceptTopConceptOfIterator = (edu.uiowa.slis.GeoNames.Concept.ConceptTopConceptOfIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Concept.ConceptTopConceptOfIterator.class);

			if (subjectURI == null && theConceptTopConceptOfIterator != null) {
				subjectURI = theConceptTopConceptOfIterator.getTopConceptOf();
			}

			if (theConceptSchemeIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?hasTopConcept where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2004/02/skos/core#hasTopConcept> ?hasTopConcept } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
					hasTopConcept = sol.get("?hasTopConcept") == null ? null : sol.get("?hasTopConcept").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in ConceptScheme doStartTag", e);
			throw new JspTagException("Exception raised in ConceptScheme doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in ConceptScheme doEndTag", e);
			throw new JspTagException("Exception raised in ConceptScheme doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setHasTopConcept(String hasTopConcept) {
		this.hasTopConcept = hasTopConcept;
	}

	public String getHasTopConcept() {
		return hasTopConcept;
	}

}
