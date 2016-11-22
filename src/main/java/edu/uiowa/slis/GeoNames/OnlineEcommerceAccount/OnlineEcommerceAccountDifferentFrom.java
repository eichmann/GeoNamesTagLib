package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountDifferentFrom extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountDifferentFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountDifferentFrom.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountDifferentFromIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountDifferentFromIterator)findAncestorWithClass(this, OnlineEcommerceAccountDifferentFromIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getDifferentFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for differentFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for differentFrom tag ");
		}
		return SKIP_BODY;
	}
}

