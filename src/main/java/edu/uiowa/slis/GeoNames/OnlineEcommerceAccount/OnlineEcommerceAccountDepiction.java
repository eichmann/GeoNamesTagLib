package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountDepiction extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountDepiction currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountDepiction.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountDepictionIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountDepictionIterator)findAncestorWithClass(this, OnlineEcommerceAccountDepictionIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getDepiction());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for depiction tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for depiction tag ");
		}
		return SKIP_BODY;
	}
}

