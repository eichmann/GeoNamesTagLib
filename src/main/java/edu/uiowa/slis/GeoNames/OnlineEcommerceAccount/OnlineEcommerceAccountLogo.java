package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountLogo extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountLogo currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountLogo.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountLogoIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountLogoIterator)findAncestorWithClass(this, OnlineEcommerceAccountLogoIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getLogo());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for logo tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for logo tag ");
		}
		return SKIP_BODY;
	}
}

