package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountSameAs extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountSameAsIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountSameAsIterator)findAncestorWithClass(this, OnlineEcommerceAccountSameAsIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

