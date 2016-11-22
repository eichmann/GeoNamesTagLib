package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountAccountInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountAccountInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountAccountInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountAccountInverseIterator theOnlineGamingAccountAccountInverseIterator = (OnlineGamingAccountAccountInverseIterator)findAncestorWithClass(this, OnlineGamingAccountAccountInverseIterator.class);
			pageContext.getOut().print(theOnlineGamingAccountAccountInverseIterator.getAccountInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for account tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for account tag ");
		}
		return SKIP_BODY;
	}
}

