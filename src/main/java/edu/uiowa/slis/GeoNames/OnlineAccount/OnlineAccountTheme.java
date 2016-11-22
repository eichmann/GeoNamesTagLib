package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountTheme extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountTheme currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountTheme.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountThemeIterator theOnlineAccount = (OnlineAccountThemeIterator)findAncestorWithClass(this, OnlineAccountThemeIterator.class);
			pageContext.getOut().print(theOnlineAccount.getTheme());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for theme tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for theme tag ");
		}
		return SKIP_BODY;
	}
}

