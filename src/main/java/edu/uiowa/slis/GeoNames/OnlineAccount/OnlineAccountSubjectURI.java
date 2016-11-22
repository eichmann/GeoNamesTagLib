package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccount theOnlineAccount = (OnlineAccount)findAncestorWithClass(this, OnlineAccount.class);
			if (!theOnlineAccount.commitNeeded) {
				pageContext.getOut().print(theOnlineAccount.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OnlineAccount theOnlineAccount = (OnlineAccount)findAncestorWithClass(this, OnlineAccount.class);
			return theOnlineAccount.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OnlineAccount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OnlineAccount theOnlineAccount = (OnlineAccount)findAncestorWithClass(this, OnlineAccount.class);
			theOnlineAccount.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for subjectURI tag ");
		}
	}
}

