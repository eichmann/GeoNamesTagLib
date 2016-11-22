package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountTheme extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountTheme currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountTheme.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountThemeIterator theOnlineGamingAccount = (OnlineGamingAccountThemeIterator)findAncestorWithClass(this, OnlineGamingAccountThemeIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getTheme());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for theme tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for theme tag ");
		}
		return SKIP_BODY;
	}
}

