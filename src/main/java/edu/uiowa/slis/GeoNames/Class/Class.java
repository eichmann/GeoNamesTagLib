package edu.uiowa.slis.GeoNames.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Class extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static Class currentInstance = null;
	private static final Log log = LogFactory.getLog(Class.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;
	String hasTopConcept = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ClassIterator theClassIterator = (ClassIterator) findAncestorWithClass(this, ClassIterator.class);

			if (theClassIterator != null) {
				subjectURI = theClassIterator.getSubjectURI();
				label = theClassIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Feature.FeatureFeatureClassIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Feature.FeatureFeatureClassIterator)this.getParent()).getFeatureClass();
			}

			edu.uiowa.slis.GeoNames.Feature.FeatureFeatureClassIterator theFeatureFeatureClassIterator = (edu.uiowa.slis.GeoNames.Feature.FeatureFeatureClassIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Feature.FeatureFeatureClassIterator.class);

			if (subjectURI == null && theFeatureFeatureClassIterator != null) {
				subjectURI = theFeatureFeatureClassIterator.getFeatureClass();
			}

			if (theClassIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Class doStartTag", e);
			throw new JspTagException("Exception raised in Class doStartTag");
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
			log.error("Exception raised in Class doEndTag", e);
			throw new JspTagException("Exception raised in Class doEndTag");
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
