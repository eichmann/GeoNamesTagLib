package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountHomepage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountHomepage currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountHomepage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountHomepageIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountHomepageIterator)findAncestorWithClass(this, OnlineEcommerceAccountHomepageIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getHomepage());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for homepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for homepage tag ");
		}
		return SKIP_BODY;
	}
}

