package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountAccountInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountAccountInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountAccountInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountAccountInverseIterator theOnlineEcommerceAccountAccountInverseIterator = (OnlineEcommerceAccountAccountInverseIterator)findAncestorWithClass(this, OnlineEcommerceAccountAccountInverseIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccountAccountInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for account tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for account tag ");
		}
		return SKIP_BODY;
	}
}

