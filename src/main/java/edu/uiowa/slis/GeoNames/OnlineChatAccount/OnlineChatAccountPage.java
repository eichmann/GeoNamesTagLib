package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountPage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountPage currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountPage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountPageIterator theOnlineChatAccount = (OnlineChatAccountPageIterator)findAncestorWithClass(this, OnlineChatAccountPageIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getPage());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for page tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for page tag ");
		}
		return SKIP_BODY;
	}
}

