package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountFundedBy extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountFundedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountFundedBy.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountFundedByIterator theOnlineGamingAccount = (OnlineGamingAccountFundedByIterator)findAncestorWithClass(this, OnlineGamingAccountFundedByIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getFundedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for fundedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for fundedBy tag ");
		}
		return SKIP_BODY;
	}
}

