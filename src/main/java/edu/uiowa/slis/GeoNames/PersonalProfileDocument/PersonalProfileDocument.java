package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class PersonalProfileDocument extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocument currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocument.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;
	String topic = null;
	String primaryTopic = null;
	String sha1 = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PersonalProfileDocumentIterator thePersonalProfileDocumentIterator = (PersonalProfileDocumentIterator) findAncestorWithClass(this, PersonalProfileDocumentIterator.class);

			if (thePersonalProfileDocumentIterator != null) {
				subjectURI = thePersonalProfileDocumentIterator.getSubjectURI();
				label = thePersonalProfileDocumentIterator.getLabel();
			}

			if (thePersonalProfileDocumentIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?topic ?primaryTopic ?sha1 where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/topic> ?topic } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/primaryTopic> ?primaryTopic } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/sha1> ?sha1 } "
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
					topic = sol.get("?topic") == null ? null : sol.get("?topic").toString();
					primaryTopic = sol.get("?primaryTopic") == null ? null : sol.get("?primaryTopic").toString();
					sha1 = sol.get("?sha1") == null ? null : sol.get("?sha1").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in PersonalProfileDocument doStartTag", e);
			throw new JspTagException("Exception raised in PersonalProfileDocument doStartTag");
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
			log.error("Exception raised in PersonalProfileDocument doEndTag", e);
			throw new JspTagException("Exception raised in PersonalProfileDocument doEndTag");
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

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTopic() {
		return topic;
	}

	public void setPrimaryTopic(String primaryTopic) {
		this.primaryTopic = primaryTopic;
	}

	public String getPrimaryTopic() {
		return primaryTopic;
	}

	public void setSha1(String sha1) {
		this.sha1 = sha1;
	}

	public String getSha1() {
		return sha1;
	}

}
