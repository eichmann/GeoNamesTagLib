package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountMaker extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountMaker currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountMaker.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountMakerIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountMakerIterator)findAncestorWithClass(this, OnlineEcommerceAccountMakerIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getMaker());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for maker tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for maker tag ");
		}
		return SKIP_BODY;
	}
}

