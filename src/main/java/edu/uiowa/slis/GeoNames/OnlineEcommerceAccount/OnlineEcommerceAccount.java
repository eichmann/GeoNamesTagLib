package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class OnlineEcommerceAccount extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccount currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccount.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;
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
	String accountServiceHomepage = null;
	String accountName = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			OnlineEcommerceAccountIterator theOnlineEcommerceAccountIterator = (OnlineEcommerceAccountIterator) findAncestorWithClass(this, OnlineEcommerceAccountIterator.class);

			if (theOnlineEcommerceAccountIterator != null) {
				subjectURI = theOnlineEcommerceAccountIterator.getSubjectURI();
				label = theOnlineEcommerceAccountIterator.getLabel();
			}

			if (theOnlineEcommerceAccountIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?name ?theme ?homepage ?page ?sameAs ?depiction ?differentFrom ?maker ?logo ?fundedBy ?isPrimaryTopicOf ?topObjectProperty ?bottomObjectProperty ?topDataProperty ?bottomDataProperty ?accountServiceHomepage ?accountName where {"
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
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/accountServiceHomepage> ?accountServiceHomepage } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/accountName> ?accountName } "
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
					accountServiceHomepage = sol.get("?accountServiceHomepage") == null ? null : sol.get("?accountServiceHomepage").toString();
					accountName = sol.get("?accountName") == null ? null : sol.get("?accountName").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in OnlineEcommerceAccount doStartTag", e);
			throw new JspTagException("Exception raised in OnlineEcommerceAccount doStartTag");
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
			log.error("Exception raised in OnlineEcommerceAccount doEndTag", e);
			throw new JspTagException("Exception raised in OnlineEcommerceAccount doEndTag");
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

	public void setAccountServiceHomepage(String accountServiceHomepage) {
		this.accountServiceHomepage = accountServiceHomepage;
	}

	public String getAccountServiceHomepage() {
		return accountServiceHomepage;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountName() {
		return accountName;
	}

}
