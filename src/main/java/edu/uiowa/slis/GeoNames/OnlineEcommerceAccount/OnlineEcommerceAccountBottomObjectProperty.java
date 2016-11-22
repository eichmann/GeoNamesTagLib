package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountBottomObjectProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountBottomObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountBottomObjectProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountBottomObjectPropertyIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountBottomObjectPropertyIterator)findAncestorWithClass(this, OnlineEcommerceAccountBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getBottomObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

