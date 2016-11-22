package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountAccountServiceHomepage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountAccountServiceHomepage currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountAccountServiceHomepage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountAccountServiceHomepageIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountAccountServiceHomepageIterator)findAncestorWithClass(this, OnlineEcommerceAccountAccountServiceHomepageIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getAccountServiceHomepage());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for accountServiceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for accountServiceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

