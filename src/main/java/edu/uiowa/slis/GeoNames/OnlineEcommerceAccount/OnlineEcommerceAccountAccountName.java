package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountAccountName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountAccountName currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountAccountName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountAccountNameIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountAccountNameIterator)findAncestorWithClass(this, OnlineEcommerceAccountAccountNameIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getAccountName());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for accountName tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for accountName tag ");
		}
		return SKIP_BODY;
	}
}

