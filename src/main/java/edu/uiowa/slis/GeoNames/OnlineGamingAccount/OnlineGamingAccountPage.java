package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountPage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountPage currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountPage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountPageIterator theOnlineGamingAccount = (OnlineGamingAccountPageIterator)findAncestorWithClass(this, OnlineGamingAccountPageIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getPage());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for page tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for page tag ");
		}
		return SKIP_BODY;
	}
}

