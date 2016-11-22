package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Thing extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static Thing currentInstance = null;
	private static final Log log = LogFactory.getLog(Thing.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String name = null;
	String theme = null;
	String homepage = null;
	String page = null;
	String sameAs = null;
	String depiction = null;
	String differentFrom = null;
	String maker = null;
	String logo = null;
	String fundedBy = null;
	String isPrimaryTopicOf = null;
	String topObjectProperty = null;
	String bottomObjectProperty = null;
	String topDataProperty = null;
	String bottomDataProperty = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ThingIterator theThingIterator = (ThingIterator) findAncestorWithClass(this, ThingIterator.class);

			if (theThingIterator != null) {
				subjectURI = theThingIterator.getSubjectURI();
				label = theThingIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingThemeIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingThemeIterator)this.getParent()).getTheme();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Document.DocumentTopicIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Document.DocumentTopicIterator)this.getParent()).getTopic();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Person.PersonPastProjectIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Person.PersonPastProjectIterator)this.getParent()).getPastProject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Agent.AgentMadeIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Agent.AgentMadeIterator)this.getParent()).getMade();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Image.ImageDepictsIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Image.ImageDepictsIterator)this.getParent()).getDepicts();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator)this.getParent()).getSourceIndividual();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingSameAsIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingSameAsIterator)this.getParent()).getSameAs();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingDifferentFromIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingDifferentFromIterator)this.getParent()).getDifferentFrom();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Concept.ConceptFocusIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Concept.ConceptFocusIterator)this.getParent()).getFocus();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Document.DocumentPrimaryTopicIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Document.DocumentPrimaryTopicIterator)this.getParent()).getPrimaryTopic();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingLogoIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingLogoIterator)this.getParent()).getLogo();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingFundedByIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingFundedByIterator)this.getParent()).getFundedBy();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Agent.AgentTopic_interestIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Agent.AgentTopic_interestIterator)this.getParent()).getTopic_interest();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator)this.getParent()).getTargetIndividual();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Agent.AgentMboxIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Agent.AgentMboxIterator)this.getParent()).getMbox();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Person.PersonCurrentProjectIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Person.PersonCurrentProjectIterator)this.getParent()).getCurrentProject();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingTopObjectPropertyIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingTopObjectPropertyIterator)this.getParent()).getTopObjectProperty();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingBottomObjectPropertyIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingBottomObjectPropertyIterator)this.getParent()).getBottomObjectProperty();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Document.DocumentHomepageInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Document.DocumentHomepageInverseIterator)this.getParent()).getHomepageInverse();
			}

			edu.uiowa.slis.GeoNames.Thing.ThingThemeIterator theThingThemeIterator = (edu.uiowa.slis.GeoNames.Thing.ThingThemeIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Thing.ThingThemeIterator.class);

			if (subjectURI == null && theThingThemeIterator != null) {
				subjectURI = theThingThemeIterator.getTheme();
			}

			edu.uiowa.slis.GeoNames.Document.DocumentTopicIterator theDocumentTopicIterator = (edu.uiowa.slis.GeoNames.Document.DocumentTopicIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Document.DocumentTopicIterator.class);

			if (subjectURI == null && theDocumentTopicIterator != null) {
				subjectURI = theDocumentTopicIterator.getTopic();
			}

			edu.uiowa.slis.GeoNames.Person.PersonPastProjectIterator thePersonPastProjectIterator = (edu.uiowa.slis.GeoNames.Person.PersonPastProjectIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Person.PersonPastProjectIterator.class);

			if (subjectURI == null && thePersonPastProjectIterator != null) {
				subjectURI = thePersonPastProjectIterator.getPastProject();
			}

			edu.uiowa.slis.GeoNames.Agent.AgentMadeIterator theAgentMadeIterator = (edu.uiowa.slis.GeoNames.Agent.AgentMadeIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Agent.AgentMadeIterator.class);

			if (subjectURI == null && theAgentMadeIterator != null) {
				subjectURI = theAgentMadeIterator.getMade();
			}

			edu.uiowa.slis.GeoNames.Image.ImageDepictsIterator theImageDepictsIterator = (edu.uiowa.slis.GeoNames.Image.ImageDepictsIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Image.ImageDepictsIterator.class);

			if (subjectURI == null && theImageDepictsIterator != null) {
				subjectURI = theImageDepictsIterator.getDepicts();
			}

			edu.uiowa.slis.GeoNames.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator theNegativePropertyAssertionSourceIndividualIterator = (edu.uiowa.slis.GeoNames.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.NegativePropertyAssertion.NegativePropertyAssertionSourceIndividualIterator.class);

			if (subjectURI == null && theNegativePropertyAssertionSourceIndividualIterator != null) {
				subjectURI = theNegativePropertyAssertionSourceIndividualIterator.getSourceIndividual();
			}

			edu.uiowa.slis.GeoNames.Thing.ThingSameAsIterator theThingSameAsIterator = (edu.uiowa.slis.GeoNames.Thing.ThingSameAsIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Thing.ThingSameAsIterator.class);

			if (subjectURI == null && theThingSameAsIterator != null) {
				subjectURI = theThingSameAsIterator.getSameAs();
			}

			edu.uiowa.slis.GeoNames.Thing.ThingDifferentFromIterator theThingDifferentFromIterator = (edu.uiowa.slis.GeoNames.Thing.ThingDifferentFromIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Thing.ThingDifferentFromIterator.class);

			if (subjectURI == null && theThingDifferentFromIterator != null) {
				subjectURI = theThingDifferentFromIterator.getDifferentFrom();
			}

			edu.uiowa.slis.GeoNames.Concept.ConceptFocusIterator theConceptFocusIterator = (edu.uiowa.slis.GeoNames.Concept.ConceptFocusIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Concept.ConceptFocusIterator.class);

			if (subjectURI == null && theConceptFocusIterator != null) {
				subjectURI = theConceptFocusIterator.getFocus();
			}

			edu.uiowa.slis.GeoNames.Document.DocumentPrimaryTopicIterator theDocumentPrimaryTopicIterator = (edu.uiowa.slis.GeoNames.Document.DocumentPrimaryTopicIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Document.DocumentPrimaryTopicIterator.class);

			if (subjectURI == null && theDocumentPrimaryTopicIterator != null) {
				subjectURI = theDocumentPrimaryTopicIterator.getPrimaryTopic();
			}

			edu.uiowa.slis.GeoNames.Thing.ThingLogoIterator theThingLogoIterator = (edu.uiowa.slis.GeoNames.Thing.ThingLogoIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Thing.ThingLogoIterator.class);

			if (subjectURI == null && theThingLogoIterator != null) {
				subjectURI = theThingLogoIterator.getLogo();
			}

			edu.uiowa.slis.GeoNames.Thing.ThingFundedByIterator theThingFundedByIterator = (edu.uiowa.slis.GeoNames.Thing.ThingFundedByIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Thing.ThingFundedByIterator.class);

			if (subjectURI == null && theThingFundedByIterator != null) {
				subjectURI = theThingFundedByIterator.getFundedBy();
			}

			edu.uiowa.slis.GeoNames.Agent.AgentTopic_interestIterator theAgentTopic_interestIterator = (edu.uiowa.slis.GeoNames.Agent.AgentTopic_interestIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Agent.AgentTopic_interestIterator.class);

			if (subjectURI == null && theAgentTopic_interestIterator != null) {
				subjectURI = theAgentTopic_interestIterator.getTopic_interest();
			}

			edu.uiowa.slis.GeoNames.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator theNegativePropertyAssertionTargetIndividualIterator = (edu.uiowa.slis.GeoNames.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.NegativePropertyAssertion.NegativePropertyAssertionTargetIndividualIterator.class);

			if (subjectURI == null && theNegativePropertyAssertionTargetIndividualIterator != null) {
				subjectURI = theNegativePropertyAssertionTargetIndividualIterator.getTargetIndividual();
			}

			edu.uiowa.slis.GeoNames.Agent.AgentMboxIterator theAgentMboxIterator = (edu.uiowa.slis.GeoNames.Agent.AgentMboxIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Agent.AgentMboxIterator.class);

			if (subjectURI == null && theAgentMboxIterator != null) {
				subjectURI = theAgentMboxIterator.getMbox();
			}

			edu.uiowa.slis.GeoNames.Person.PersonCurrentProjectIterator thePersonCurrentProjectIterator = (edu.uiowa.slis.GeoNames.Person.PersonCurrentProjectIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Person.PersonCurrentProjectIterator.class);

			if (subjectURI == null && thePersonCurrentProjectIterator != null) {
				subjectURI = thePersonCurrentProjectIterator.getCurrentProject();
			}

			edu.uiowa.slis.GeoNames.Thing.ThingTopObjectPropertyIterator theThingTopObjectPropertyIterator = (edu.uiowa.slis.GeoNames.Thing.ThingTopObjectPropertyIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Thing.ThingTopObjectPropertyIterator.class);

			if (subjectURI == null && theThingTopObjectPropertyIterator != null) {
				subjectURI = theThingTopObjectPropertyIterator.getTopObjectProperty();
			}

			edu.uiowa.slis.GeoNames.Thing.ThingBottomObjectPropertyIterator theThingBottomObjectPropertyIterator = (edu.uiowa.slis.GeoNames.Thing.ThingBottomObjectPropertyIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Thing.ThingBottomObjectPropertyIterator.class);

			if (subjectURI == null && theThingBottomObjectPropertyIterator != null) {
				subjectURI = theThingBottomObjectPropertyIterator.getBottomObjectProperty();
			}

			if (theThingIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?name ?theme ?homepage ?page ?sameAs ?depiction ?differentFrom ?maker ?logo ?fundedBy ?isPrimaryTopicOf ?topObjectProperty ?bottomObjectProperty ?topDataProperty ?bottomDataProperty where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?name } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/theme> ?theme } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/homepage> ?homepage } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/page> ?page } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2002/07/owl#sameAs> ?sameAs } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/depiction> ?depiction } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2002/07/owl#differentFrom> ?differentFrom } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/maker> ?maker } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/logo> ?logo } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/fundedBy> ?fundedBy } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/isPrimaryTopicOf> ?isPrimaryTopicOf } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2002/07/owl#topObjectProperty> ?topObjectProperty } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2002/07/owl#bottomObjectProperty> ?bottomObjectProperty } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2002/07/owl#topDataProperty> ?topDataProperty } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2002/07/owl#bottomDataProperty> ?bottomDataProperty } "
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
					name = sol.get("?name") == null ? null : sol.get("?name").toString();
					theme = sol.get("?theme") == null ? null : sol.get("?theme").toString();
					homepage = sol.get("?homepage") == null ? null : sol.get("?homepage").toString();
					page = sol.get("?page") == null ? null : sol.get("?page").toString();
					sameAs = sol.get("?sameAs") == null ? null : sol.get("?sameAs").toString();
					depiction = sol.get("?depiction") == null ? null : sol.get("?depiction").toString();
					differentFrom = sol.get("?differentFrom") == null ? null : sol.get("?differentFrom").toString();
					maker = sol.get("?maker") == null ? null : sol.get("?maker").toString();
					logo = sol.get("?logo") == null ? null : sol.get("?logo").toString();
					fundedBy = sol.get("?fundedBy") == null ? null : sol.get("?fundedBy").toString();
					isPrimaryTopicOf = sol.get("?isPrimaryTopicOf") == null ? null : sol.get("?isPrimaryTopicOf").toString();
					topObjectProperty = sol.get("?topObjectProperty") == null ? null : sol.get("?topObjectProperty").toString();
					bottomObjectProperty = sol.get("?bottomObjectProperty") == null ? null : sol.get("?bottomObjectProperty").toString();
					topDataProperty = sol.get("?topDataProperty") == null ? null : sol.get("?topDataProperty").toString();
					bottomDataProperty = sol.get("?bottomDataProperty") == null ? null : sol.get("?bottomDataProperty").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Thing doStartTag", e);
			throw new JspTagException("Exception raised in Thing doStartTag");
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
			log.error("Exception raised in Thing doEndTag", e);
			throw new JspTagException("Exception raised in Thing doEndTag");
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

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getTheme() {
		return theme;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getPage() {
		return page;
	}

	public void setSameAs(String sameAs) {
		this.sameAs = sameAs;
	}

	public String getSameAs() {
		return sameAs;
	}

	public void setDepiction(String depiction) {
		this.depiction = depiction;
	}

	public String getDepiction() {
		return depiction;
	}

	public void setDifferentFrom(String differentFrom) {
		this.differentFrom = differentFrom;
	}

	public String getDifferentFrom() {
		return differentFrom;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getMaker() {
		return maker;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getLogo() {
		return logo;
	}

	public void setFundedBy(String fundedBy) {
		this.fundedBy = fundedBy;
	}

	public String getFundedBy() {
		return fundedBy;
	}

	public void setIsPrimaryTopicOf(String isPrimaryTopicOf) {
		this.isPrimaryTopicOf = isPrimaryTopicOf;
	}

	public String getIsPrimaryTopicOf() {
		return isPrimaryTopicOf;
	}

	public void setTopObjectProperty(String topObjectProperty) {
		this.topObjectProperty = topObjectProperty;
	}

	public String getTopObjectProperty() {
		return topObjectProperty;
	}

	public void setBottomObjectProperty(String bottomObjectProperty) {
		this.bottomObjectProperty = bottomObjectProperty;
	}

	public String getBottomObjectProperty() {
		return bottomObjectProperty;
	}

	public void setTopDataProperty(String topDataProperty) {
		this.topDataProperty = topDataProperty;
	}

	public String getTopDataProperty() {
		return topDataProperty;
	}

	public void setBottomDataProperty(String bottomDataProperty) {
		this.bottomDataProperty = bottomDataProperty;
	}

	public String getBottomDataProperty() {
		return bottomDataProperty;
	}

}
