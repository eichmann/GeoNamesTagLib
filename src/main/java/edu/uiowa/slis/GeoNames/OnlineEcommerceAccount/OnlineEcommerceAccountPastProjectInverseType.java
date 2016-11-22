package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountPastProjectInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountPastProjectInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountPastProjectInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountPastProjectInverseIterator theOnlineEcommerceAccountPastProjectInverseIterator = (OnlineEcommerceAccountPastProjectInverseIterator)findAncestorWithClass(this, OnlineEcommerceAccountPastProjectInverseIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccountPastProjectInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for pastProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for pastProject tag ");
		}
		return SKIP_BODY;
	}
}

