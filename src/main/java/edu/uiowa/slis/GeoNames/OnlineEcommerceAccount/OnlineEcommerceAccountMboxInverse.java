package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountMboxInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountMboxInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountMboxInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountMboxInverseIterator theOnlineEcommerceAccountMboxInverseIterator = (OnlineEcommerceAccountMboxInverseIterator)findAncestorWithClass(this, OnlineEcommerceAccountMboxInverseIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccountMboxInverseIterator.getMboxInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for mbox tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for mbox tag ");
		}
		return SKIP_BODY;
	}
}

