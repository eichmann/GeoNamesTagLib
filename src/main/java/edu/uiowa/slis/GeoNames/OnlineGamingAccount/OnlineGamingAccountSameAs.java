package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountSameAs extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountSameAsIterator theOnlineGamingAccount = (OnlineGamingAccountSameAsIterator)findAncestorWithClass(this, OnlineGamingAccountSameAsIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

