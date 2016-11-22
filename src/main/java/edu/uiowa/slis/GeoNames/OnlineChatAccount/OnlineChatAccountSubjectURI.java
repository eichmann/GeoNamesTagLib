package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccount theOnlineChatAccount = (OnlineChatAccount)findAncestorWithClass(this, OnlineChatAccount.class);
			if (!theOnlineChatAccount.commitNeeded) {
				pageContext.getOut().print(theOnlineChatAccount.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OnlineChatAccount theOnlineChatAccount = (OnlineChatAccount)findAncestorWithClass(this, OnlineChatAccount.class);
			return theOnlineChatAccount.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OnlineChatAccount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OnlineChatAccount theOnlineChatAccount = (OnlineChatAccount)findAncestorWithClass(this, OnlineChatAccount.class);
			theOnlineChatAccount.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for subjectURI tag ");
		}
	}
}

