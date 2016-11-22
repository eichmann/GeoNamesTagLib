package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Code extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static Code currentInstance = null;
	private static final Log log = LogFactory.getLog(Code.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String prefLabel = null;
	String inScheme = null;
	String notation = null;
	String semanticRelation = null;
	String focus = null;
	String topConceptOf = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			CodeIterator theCodeIterator = (CodeIterator) findAncestorWithClass(this, CodeIterator.class);

			if (theCodeIterator != null) {
				subjectURI = theCodeIterator.getSubjectURI();
				label = theCodeIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Feature.FeatureFeatureCodeIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Feature.FeatureFeatureCodeIterator)this.getParent()).getFeatureCode();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.ConceptScheme.ConceptSchemeInSchemeInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.ConceptScheme.ConceptSchemeInSchemeInverseIterator)this.getParent()).getInSchemeInverse();
			}

			edu.uiowa.slis.GeoNames.Feature.FeatureFeatureCodeIterator theFeatureFeatureCodeIterator = (edu.uiowa.slis.GeoNames.Feature.FeatureFeatureCodeIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Feature.FeatureFeatureCodeIterator.class);

			if (subjectURI == null && theFeatureFeatureCodeIterator != null) {
				subjectURI = theFeatureFeatureCodeIterator.getFeatureCode();
			}

			if (theCodeIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?prefLabel ?inScheme ?notation ?semanticRelation ?focus ?topConceptOf where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2004/02/skos/core#prefLabel> ?prefLabel } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2004/02/skos/core#inScheme> ?inScheme } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2004/02/skos/core#notation> ?notation } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2004/02/skos/core#semanticRelation> ?semanticRelation } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/focus> ?focus } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2004/02/skos/core#topConceptOf> ?topConceptOf } "
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
					prefLabel = sol.get("?prefLabel") == null ? null : sol.get("?prefLabel").toString();
					inScheme = sol.get("?inScheme") == null ? null : sol.get("?inScheme").toString();
					notation = sol.get("?notation") == null ? null : sol.get("?notation").toString();
					semanticRelation = sol.get("?semanticRelation") == null ? null : sol.get("?semanticRelation").toString();
					focus = sol.get("?focus") == null ? null : sol.get("?focus").toString();
					topConceptOf = sol.get("?topConceptOf") == null ? null : sol.get("?topConceptOf").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Code doStartTag", e);
			throw new JspTagException("Exception raised in Code doStartTag");
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
			log.error("Exception raised in Code doEndTag", e);
			throw new JspTagException("Exception raised in Code doEndTag");
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
	    log.info("requesting: " + subjectURI);
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

	public void setPrefLabel(String prefLabel) {
		this.prefLabel = prefLabel;
	}

	public String getPrefLabel() {
		return prefLabel;
	}

	public void setInScheme(String inScheme) {
		this.inScheme = inScheme;
	}

	public String getInScheme() {
		return inScheme;
	}

	public void setNotation(String notation) {
		this.notation = notation;
	}

	public String getNotation() {
		return notation;
	}

	public void setSemanticRelation(String semanticRelation) {
		this.semanticRelation = semanticRelation;
	}

	public String getSemanticRelation() {
		return semanticRelation;
	}

	public void setFocus(String focus) {
		this.focus = focus;
	}

	public String getFocus() {
		return focus;
	}

	public void setTopConceptOf(String topConceptOf) {
		this.topConceptOf = topConceptOf;
	}

	public String getTopConceptOf() {
		return topConceptOf;
	}

}
