package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountBottomDataProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountBottomDataPropertyIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountBottomDataPropertyIterator)findAncestorWithClass(this, OnlineEcommerceAccountBottomDataPropertyIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

