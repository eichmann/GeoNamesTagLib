package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountDepiction extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountDepiction currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountDepiction.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountDepictionIterator theOnlineGamingAccount = (OnlineGamingAccountDepictionIterator)findAncestorWithClass(this, OnlineGamingAccountDepictionIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getDepiction());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for depiction tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for depiction tag ");
		}
		return SKIP_BODY;
	}
}

