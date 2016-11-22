package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountName currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountNameIterator theOnlineGamingAccount = (OnlineGamingAccountNameIterator)findAncestorWithClass(this, OnlineGamingAccountNameIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for name tag ");
		}
		return SKIP_BODY;
	}
}

