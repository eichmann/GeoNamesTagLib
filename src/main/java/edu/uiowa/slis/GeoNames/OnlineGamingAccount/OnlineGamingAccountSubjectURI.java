package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccount theOnlineGamingAccount = (OnlineGamingAccount)findAncestorWithClass(this, OnlineGamingAccount.class);
			if (!theOnlineGamingAccount.commitNeeded) {
				pageContext.getOut().print(theOnlineGamingAccount.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OnlineGamingAccount theOnlineGamingAccount = (OnlineGamingAccount)findAncestorWithClass(this, OnlineGamingAccount.class);
			return theOnlineGamingAccount.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OnlineGamingAccount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OnlineGamingAccount theOnlineGamingAccount = (OnlineGamingAccount)findAncestorWithClass(this, OnlineGamingAccount.class);
			theOnlineGamingAccount.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for subjectURI tag ");
		}
	}
}

