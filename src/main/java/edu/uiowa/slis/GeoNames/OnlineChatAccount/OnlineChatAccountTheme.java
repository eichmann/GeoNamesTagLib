package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountTheme extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountTheme currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountTheme.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountThemeIterator theOnlineChatAccount = (OnlineChatAccountThemeIterator)findAncestorWithClass(this, OnlineChatAccountThemeIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getTheme());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for theme tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for theme tag ");
		}
		return SKIP_BODY;
	}
}

