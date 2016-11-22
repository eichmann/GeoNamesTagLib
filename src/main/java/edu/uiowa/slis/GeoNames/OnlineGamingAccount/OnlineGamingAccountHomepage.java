package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountHomepage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountHomepage currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountHomepage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountHomepageIterator theOnlineGamingAccount = (OnlineGamingAccountHomepageIterator)findAncestorWithClass(this, OnlineGamingAccountHomepageIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getHomepage());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for homepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for homepage tag ");
		}
		return SKIP_BODY;
	}
}

