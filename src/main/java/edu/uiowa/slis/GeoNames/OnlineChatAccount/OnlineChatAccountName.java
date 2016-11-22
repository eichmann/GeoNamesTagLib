package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountName currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountNameIterator theOnlineChatAccount = (OnlineChatAccountNameIterator)findAncestorWithClass(this, OnlineChatAccountNameIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for name tag ");
		}
		return SKIP_BODY;
	}
}

