package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountAccountServiceHomepage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountAccountServiceHomepage currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountAccountServiceHomepage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountAccountServiceHomepageIterator theOnlineChatAccount = (OnlineChatAccountAccountServiceHomepageIterator)findAncestorWithClass(this, OnlineChatAccountAccountServiceHomepageIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getAccountServiceHomepage());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for accountServiceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for accountServiceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

