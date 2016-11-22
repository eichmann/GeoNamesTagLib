package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountMboxInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountMboxInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountMboxInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountMboxInverseIterator theOnlineEcommerceAccountMboxInverseIterator = (OnlineEcommerceAccountMboxInverseIterator)findAncestorWithClass(this, OnlineEcommerceAccountMboxInverseIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccountMboxInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for mbox tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for mbox tag ");
		}
		return SKIP_BODY;
	}
}

