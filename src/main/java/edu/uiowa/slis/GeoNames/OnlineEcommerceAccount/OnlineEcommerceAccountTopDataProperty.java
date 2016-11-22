package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountTopDataProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountTopDataPropertyIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountTopDataPropertyIterator)findAncestorWithClass(this, OnlineEcommerceAccountTopDataPropertyIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

