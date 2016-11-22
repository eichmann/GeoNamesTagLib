package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountMaker extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountMaker currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountMaker.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountMakerIterator theOnlineGamingAccount = (OnlineGamingAccountMakerIterator)findAncestorWithClass(this, OnlineGamingAccountMakerIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getMaker());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for maker tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for maker tag ");
		}
		return SKIP_BODY;
	}
}

