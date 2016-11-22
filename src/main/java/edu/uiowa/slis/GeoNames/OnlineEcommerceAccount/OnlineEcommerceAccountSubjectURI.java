package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccount theOnlineEcommerceAccount = (OnlineEcommerceAccount)findAncestorWithClass(this, OnlineEcommerceAccount.class);
			if (!theOnlineEcommerceAccount.commitNeeded) {
				pageContext.getOut().print(theOnlineEcommerceAccount.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OnlineEcommerceAccount theOnlineEcommerceAccount = (OnlineEcommerceAccount)findAncestorWithClass(this, OnlineEcommerceAccount.class);
			return theOnlineEcommerceAccount.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OnlineEcommerceAccount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OnlineEcommerceAccount theOnlineEcommerceAccount = (OnlineEcommerceAccount)findAncestorWithClass(this, OnlineEcommerceAccount.class);
			theOnlineEcommerceAccount.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for subjectURI tag ");
		}
	}
}

