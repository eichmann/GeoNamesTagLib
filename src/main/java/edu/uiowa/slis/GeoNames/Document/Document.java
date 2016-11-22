package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Document extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static Document currentInstance = null;
	private static final Log log = LogFactory.getLog(Document.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String topic = null;
	String primaryTopic = null;
	String sha1 = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			DocumentIterator theDocumentIterator = (DocumentIterator) findAncestorWithClass(this, DocumentIterator.class);

			if (theDocumentIterator != null) {
				subjectURI = theDocumentIterator.getSubjectURI();
				label = theDocumentIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Agent.AgentOpenidIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Agent.AgentOpenidIterator)this.getParent()).getOpenid();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Agent.AgentWeblogIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Agent.AgentWeblogIterator)this.getParent()).getWeblog();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingHomepageIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingHomepageIterator)this.getParent()).getHomepage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Agent.AgentInterestIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Agent.AgentInterestIterator)this.getParent()).getInterest();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Person.PersonSchoolHomepageIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Person.PersonSchoolHomepageIterator)this.getParent()).getSchoolHomepage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingPageIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingPageIterator)this.getParent()).getPage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Agent.AgentTipjarIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Agent.AgentTipjarIterator)this.getParent()).getTipjar();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.OnlineAccount.OnlineAccountAccountServiceHomepageIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.OnlineAccount.OnlineAccountAccountServiceHomepageIterator)this.getParent()).getAccountServiceHomepage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Person.PersonPublicationsIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Person.PersonPublicationsIterator)this.getParent()).getPublications();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Person.PersonWorkplaceHomepageIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Person.PersonWorkplaceHomepageIterator)this.getParent()).getWorkplaceHomepage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Person.PersonWorkInfoHomepageIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Person.PersonWorkInfoHomepageIterator)this.getParent()).getWorkInfoHomepage();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingIsPrimaryTopicOfIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingIsPrimaryTopicOfIterator)this.getParent()).getIsPrimaryTopicOf();
			}

			edu.uiowa.slis.GeoNames.Agent.AgentOpenidIterator theAgentOpenidIterator = (edu.uiowa.slis.GeoNames.Agent.AgentOpenidIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Agent.AgentOpenidIterator.class);

			if (subjectURI == null && theAgentOpenidIterator != null) {
				subjectURI = theAgentOpenidIterator.getOpenid();
			}

			edu.uiowa.slis.GeoNames.Agent.AgentWeblogIterator theAgentWeblogIterator = (edu.uiowa.slis.GeoNames.Agent.AgentWeblogIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Agent.AgentWeblogIterator.class);

			if (subjectURI == null && theAgentWeblogIterator != null) {
				subjectURI = theAgentWeblogIterator.getWeblog();
			}

			edu.uiowa.slis.GeoNames.Thing.ThingHomepageIterator theThingHomepageIterator = (edu.uiowa.slis.GeoNames.Thing.ThingHomepageIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Thing.ThingHomepageIterator.class);

			if (subjectURI == null && theThingHomepageIterator != null) {
				subjectURI = theThingHomepageIterator.getHomepage();
			}

			edu.uiowa.slis.GeoNames.Agent.AgentInterestIterator theAgentInterestIterator = (edu.uiowa.slis.GeoNames.Agent.AgentInterestIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Agent.AgentInterestIterator.class);

			if (subjectURI == null && theAgentInterestIterator != null) {
				subjectURI = theAgentInterestIterator.getInterest();
			}

			edu.uiowa.slis.GeoNames.Person.PersonSchoolHomepageIterator thePersonSchoolHomepageIterator = (edu.uiowa.slis.GeoNames.Person.PersonSchoolHomepageIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Person.PersonSchoolHomepageIterator.class);

			if (subjectURI == null && thePersonSchoolHomepageIterator != null) {
				subjectURI = thePersonSchoolHomepageIterator.getSchoolHomepage();
			}

			edu.uiowa.slis.GeoNames.Thing.ThingPageIterator theThingPageIterator = (edu.uiowa.slis.GeoNames.Thing.ThingPageIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Thing.ThingPageIterator.class);

			if (subjectURI == null && theThingPageIterator != null) {
				subjectURI = theThingPageIterator.getPage();
			}

			edu.uiowa.slis.GeoNames.Agent.AgentTipjarIterator theAgentTipjarIterator = (edu.uiowa.slis.GeoNames.Agent.AgentTipjarIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Agent.AgentTipjarIterator.class);

			if (subjectURI == null && theAgentTipjarIterator != null) {
				subjectURI = theAgentTipjarIterator.getTipjar();
			}

			edu.uiowa.slis.GeoNames.OnlineAccount.OnlineAccountAccountServiceHomepageIterator theOnlineAccountAccountServiceHomepageIterator = (edu.uiowa.slis.GeoNames.OnlineAccount.OnlineAccountAccountServiceHomepageIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.OnlineAccount.OnlineAccountAccountServiceHomepageIterator.class);

			if (subjectURI == null && theOnlineAccountAccountServiceHomepageIterator != null) {
				subjectURI = theOnlineAccountAccountServiceHomepageIterator.getAccountServiceHomepage();
			}

			edu.uiowa.slis.GeoNames.Person.PersonPublicationsIterator thePersonPublicationsIterator = (edu.uiowa.slis.GeoNames.Person.PersonPublicationsIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Person.PersonPublicationsIterator.class);

			if (subjectURI == null && thePersonPublicationsIterator != null) {
				subjectURI = thePersonPublicationsIterator.getPublications();
			}

			edu.uiowa.slis.GeoNames.Person.PersonWorkplaceHomepageIterator thePersonWorkplaceHomepageIterator = (edu.uiowa.slis.GeoNames.Person.PersonWorkplaceHomepageIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Person.PersonWorkplaceHomepageIterator.class);

			if (subjectURI == null && thePersonWorkplaceHomepageIterator != null) {
				subjectURI = thePersonWorkplaceHomepageIterator.getWorkplaceHomepage();
			}

			edu.uiowa.slis.GeoNames.Person.PersonWorkInfoHomepageIterator thePersonWorkInfoHomepageIterator = (edu.uiowa.slis.GeoNames.Person.PersonWorkInfoHomepageIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Person.PersonWorkInfoHomepageIterator.class);

			if (subjectURI == null && thePersonWorkInfoHomepageIterator != null) {
				subjectURI = thePersonWorkInfoHomepageIterator.getWorkInfoHomepage();
			}

			edu.uiowa.slis.GeoNames.Thing.ThingIsPrimaryTopicOfIterator theThingIsPrimaryTopicOfIterator = (edu.uiowa.slis.GeoNames.Thing.ThingIsPrimaryTopicOfIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Thing.ThingIsPrimaryTopicOfIterator.class);

			if (subjectURI == null && theThingIsPrimaryTopicOfIterator != null) {
				subjectURI = theThingIsPrimaryTopicOfIterator.getIsPrimaryTopicOf();
			}

			if (theDocumentIterator == null && subjectURI == null) {
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
			log.error("Exception raised in Document doStartTag", e);
			throw new JspTagException("Exception raised in Document doStartTag");
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
			log.error("Exception raised in Document doEndTag", e);
			throw new JspTagException("Exception raised in Document doEndTag");
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
