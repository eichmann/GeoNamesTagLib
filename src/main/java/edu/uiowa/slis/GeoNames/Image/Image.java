package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Image extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static Image currentInstance = null;
	private static final Log log = LogFactory.getLog(Image.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String depicts = null;
	String thumbnail = null;
	String topic = null;
	String primaryTopic = null;
	String sha1 = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ImageIterator theImageIterator = (ImageIterator) findAncestorWithClass(this, ImageIterator.class);

			if (theImageIterator != null) {
				subjectURI = theImageIterator.getSubjectURI();
				label = theImageIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingDepictionIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingDepictionIterator)this.getParent()).getDepiction();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Image.ImageThumbnailIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Image.ImageThumbnailIterator)this.getParent()).getThumbnail();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Person.PersonImgIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Person.PersonImgIterator)this.getParent()).getImg();
			}

			edu.uiowa.slis.GeoNames.Thing.ThingDepictionIterator theThingDepictionIterator = (edu.uiowa.slis.GeoNames.Thing.ThingDepictionIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Thing.ThingDepictionIterator.class);

			if (subjectURI == null && theThingDepictionIterator != null) {
				subjectURI = theThingDepictionIterator.getDepiction();
			}

			edu.uiowa.slis.GeoNames.Image.ImageThumbnailIterator theImageThumbnailIterator = (edu.uiowa.slis.GeoNames.Image.ImageThumbnailIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Image.ImageThumbnailIterator.class);

			if (subjectURI == null && theImageThumbnailIterator != null) {
				subjectURI = theImageThumbnailIterator.getThumbnail();
			}

			edu.uiowa.slis.GeoNames.Person.PersonImgIterator thePersonImgIterator = (edu.uiowa.slis.GeoNames.Person.PersonImgIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Person.PersonImgIterator.class);

			if (subjectURI == null && thePersonImgIterator != null) {
				subjectURI = thePersonImgIterator.getImg();
			}

			if (theImageIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?depicts ?thumbnail ?topic ?primaryTopic ?sha1 where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/depicts> ?depicts } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/thumbnail> ?thumbnail } "
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
					depicts = sol.get("?depicts") == null ? null : sol.get("?depicts").toString();
					thumbnail = sol.get("?thumbnail") == null ? null : sol.get("?thumbnail").toString();
					topic = sol.get("?topic") == null ? null : sol.get("?topic").toString();
					primaryTopic = sol.get("?primaryTopic") == null ? null : sol.get("?primaryTopic").toString();
					sha1 = sol.get("?sha1") == null ? null : sol.get("?sha1").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Image doStartTag", e);
			throw new JspTagException("Exception raised in Image doStartTag");
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
			log.error("Exception raised in Image doEndTag", e);
			throw new JspTagException("Exception raised in Image doEndTag");
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

	public void setDepicts(String depicts) {
		this.depicts = depicts;
	}

	public String getDepicts() {
		return depicts;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getThumbnail() {
		return thumbnail;
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
