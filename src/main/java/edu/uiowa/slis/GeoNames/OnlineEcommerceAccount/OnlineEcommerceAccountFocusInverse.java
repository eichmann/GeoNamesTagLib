package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountFocusInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountFocusInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountFocusInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountFocusInverseIterator theOnlineEcommerceAccountFocusInverseIterator = (OnlineEcommerceAccountFocusInverseIterator)findAncestorWithClass(this, OnlineEcommerceAccountFocusInverseIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccountFocusInverseIterator.getFocusInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for focus tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for focus tag ");
		}
		return SKIP_BODY;
	}
}

