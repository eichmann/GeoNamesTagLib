package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountHoldsAccountInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountHoldsAccountInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountHoldsAccountInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountHoldsAccountInverseIterator theOnlineEcommerceAccountHoldsAccountInverseIterator = (OnlineEcommerceAccountHoldsAccountInverseIterator)findAncestorWithClass(this, OnlineEcommerceAccountHoldsAccountInverseIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccountHoldsAccountInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for holdsAccount tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for holdsAccount tag ");
		}
		return SKIP_BODY;
	}
}

