package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class OnlineGamingAccountAccountServiceHomepageIterator extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountAccountServiceHomepageIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountAccountServiceHomepageIterator.class);

	String subjectURI = null;
	String accountServiceHomepage = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			OnlineGamingAccount ancestorInstance = (OnlineGamingAccount) findAncestorWithClass(this, OnlineGamingAccount.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/accountServiceHomepage> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				accountServiceHomepage = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in OnlineGamingAccountIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in OnlineGamingAccountIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				accountServiceHomepage = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in OnlineGamingAccountIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in OnlineGamingAccountIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in OnlineGamingAccount doEndTag", e);
			throw new JspTagException("Exception raised in OnlineGamingAccount doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setAccountServiceHomepage(String accountServiceHomepage) {
		this.accountServiceHomepage = accountServiceHomepage;
	}

	public String getAccountServiceHomepage() {
		return accountServiceHomepage;
	}

}
