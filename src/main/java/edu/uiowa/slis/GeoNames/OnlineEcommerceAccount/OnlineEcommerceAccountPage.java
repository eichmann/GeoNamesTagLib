package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountPage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountPage currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountPage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountPageIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountPageIterator)findAncestorWithClass(this, OnlineEcommerceAccountPageIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getPage());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for page tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for page tag ");
		}
		return SKIP_BODY;
	}
}

