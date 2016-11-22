package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountAccountServiceHomepage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountAccountServiceHomepage currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountAccountServiceHomepage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountAccountServiceHomepageIterator theOnlineGamingAccount = (OnlineGamingAccountAccountServiceHomepageIterator)findAncestorWithClass(this, OnlineGamingAccountAccountServiceHomepageIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getAccountServiceHomepage());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for accountServiceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for accountServiceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

