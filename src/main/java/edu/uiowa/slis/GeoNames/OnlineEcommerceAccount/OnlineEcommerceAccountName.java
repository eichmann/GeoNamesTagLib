package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountName currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountNameIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountNameIterator)findAncestorWithClass(this, OnlineEcommerceAccountNameIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for name tag ");
		}
		return SKIP_BODY;
	}
}

