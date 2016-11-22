package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountFocusInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountFocusInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountFocusInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountFocusInverseIterator theOnlineGamingAccountFocusInverseIterator = (OnlineGamingAccountFocusInverseIterator)findAncestorWithClass(this, OnlineGamingAccountFocusInverseIterator.class);
			pageContext.getOut().print(theOnlineGamingAccountFocusInverseIterator.getFocusInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for focus tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for focus tag ");
		}
		return SKIP_BODY;
	}
}

