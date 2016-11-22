package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountDifferentFrom extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountDifferentFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountDifferentFrom.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountDifferentFromIterator theOnlineGamingAccount = (OnlineGamingAccountDifferentFromIterator)findAncestorWithClass(this, OnlineGamingAccountDifferentFromIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getDifferentFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for differentFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for differentFrom tag ");
		}
		return SKIP_BODY;
	}
}

