package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountAccountName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountAccountName currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountAccountName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountAccountNameIterator theOnlineChatAccount = (OnlineChatAccountAccountNameIterator)findAncestorWithClass(this, OnlineChatAccountAccountNameIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getAccountName());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for accountName tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for accountName tag ");
		}
		return SKIP_BODY;
	}
}

