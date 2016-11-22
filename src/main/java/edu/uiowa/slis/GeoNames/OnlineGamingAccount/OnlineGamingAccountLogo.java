package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountLogo extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountLogo currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountLogo.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountLogoIterator theOnlineGamingAccount = (OnlineGamingAccountLogoIterator)findAncestorWithClass(this, OnlineGamingAccountLogoIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getLogo());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for logo tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for logo tag ");
		}
		return SKIP_BODY;
	}
}

