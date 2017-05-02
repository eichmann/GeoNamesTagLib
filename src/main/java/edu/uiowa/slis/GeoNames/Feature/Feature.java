package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Feature extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static Feature currentInstance = null;
	private static final Log log = LogFactory.getLog(Feature.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String lat = null;
	String alt = null;
	String lng = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			FeatureIterator theFeatureIterator = (FeatureIterator) findAncestorWithClass(this, FeatureIterator.class);

			if (theFeatureIterator != null) {
				subjectURI = theFeatureIterator.getSubjectURI();
				label = theFeatureIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Feature.FeatureParentFeatureIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Feature.FeatureParentFeatureIterator)this.getParent()).getParentFeature();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Class.ClassFeatureClassInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Class.ClassFeatureClassInverseIterator)this.getParent()).getFeatureClassInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Code.CodeFeatureCodeInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Code.CodeFeatureCodeInverseIterator)this.getParent()).getFeatureCodeInverse();
			}

			edu.uiowa.slis.GeoNames.Feature.FeatureParentFeatureIterator theFeatureParentFeatureIterator = (edu.uiowa.slis.GeoNames.Feature.FeatureParentFeatureIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Feature.FeatureParentFeatureIterator.class);

			if (subjectURI == null && theFeatureParentFeatureIterator != null) {
				subjectURI = theFeatureParentFeatureIterator.getParentFeature();
			}

			if (theFeatureIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?labelUS ?labelENG ?label ?labelANY ?foafName ?schemaName ?rdfValue ?altLabel  where {"
				+ "  OPTIONAL { SELECT ?labelUS  WHERE { <" + subjectURI + "> rdfs:label ?labelUS  FILTER (lang(?labelUS) = \"en-US\")}    LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelENG WHERE { <" + subjectURI + "> rdfs:label ?labelENG FILTER (langMatches(?labelENG,\"en\"))} LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?label    WHERE { <" + subjectURI + "> rdfs:label ?label    FILTER (lang(?label) = \"\")}           LIMIT 1 } "
				+ "  OPTIONAL { SELECT ?labelANY WHERE { <" + subjectURI + "> rdfs:label ?labelANY FILTER (lang(?labelANY) != \"\")}       LIMIT 1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#name> ?altLabel } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?labelUS") == null ? null : sol.get("?labelUS").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelENG") == null ? null : sol.get("?labelENG").asLiteral().getString();
					if (label == null)
						label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?labelANY") == null ? null : sol.get("?labelANY").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
					if (label == null)
						label = sol.get("?altLabel") == null ? null : sol.get("?altLabel").asLiteral().getString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Feature doStartTag", e);
			throw new JspTagException("Exception raised in Feature doStartTag");
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
			log.error("Exception raised in Feature doEndTag", e);
			throw new JspTagException("Exception raised in Feature doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public  void setSubjectURI(String theSubjectURI) {
		subjectURI = theSubjectURI;
	}

	public  String getSubjectURI() {
		return subjectURI;
	}

	public  void setLabel(String theLabel) {
		label = theLabel;
	}

	public  String getLabel() {
		return label;
	}

	public  void setLat(String theLat) {
		lat = theLat;
	}

	public  String getLat() {
		return lat;
	}

	public  void setAlt(String theAlt) {
		alt = theAlt;
	}

	public  String getAlt() {
		return alt;
	}

	public  void setLong(String theLong) {
		lng = theLong;
	}

	public  String getLong() {
		return lng;
	}

}
