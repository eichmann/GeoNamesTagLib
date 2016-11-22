package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountPastProjectInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountPastProjectInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountPastProjectInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountPastProjectInverseIterator theOnlineEcommerceAccountPastProjectInverseIterator = (OnlineEcommerceAccountPastProjectInverseIterator)findAncestorWithClass(this, OnlineEcommerceAccountPastProjectInverseIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccountPastProjectInverseIterator.getPastProjectInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for pastProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for pastProject tag ");
		}
		return SKIP_BODY;
	}
}

