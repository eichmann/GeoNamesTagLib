package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountTopObjectProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountTopObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountTopObjectProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountTopObjectPropertyIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountTopObjectPropertyIterator)findAncestorWithClass(this, OnlineEcommerceAccountTopObjectPropertyIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getTopObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

