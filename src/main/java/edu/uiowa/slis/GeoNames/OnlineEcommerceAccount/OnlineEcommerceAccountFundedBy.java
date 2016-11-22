package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountFundedBy extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountFundedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountFundedBy.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountFundedByIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountFundedByIterator)findAncestorWithClass(this, OnlineEcommerceAccountFundedByIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getFundedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for fundedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for fundedBy tag ");
		}
		return SKIP_BODY;
	}
}

