package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountTheme extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountTheme currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountTheme.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountThemeIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountThemeIterator)findAncestorWithClass(this, OnlineEcommerceAccountThemeIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getTheme());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for theme tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for theme tag ");
		}
		return SKIP_BODY;
	}
}

