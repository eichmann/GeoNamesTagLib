package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountHomepage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountHomepage currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountHomepage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountHomepageIterator theOnlineChatAccount = (OnlineChatAccountHomepageIterator)findAncestorWithClass(this, OnlineChatAccountHomepageIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getHomepage());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for homepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for homepage tag ");
		}
		return SKIP_BODY;
	}
}

