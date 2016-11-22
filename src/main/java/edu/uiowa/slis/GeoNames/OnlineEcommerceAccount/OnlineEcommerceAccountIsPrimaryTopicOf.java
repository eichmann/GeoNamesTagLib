package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountIsPrimaryTopicOf extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountIsPrimaryTopicOf currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountIsPrimaryTopicOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountIsPrimaryTopicOfIterator theOnlineEcommerceAccount = (OnlineEcommerceAccountIsPrimaryTopicOfIterator)findAncestorWithClass(this, OnlineEcommerceAccountIsPrimaryTopicOfIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccount.getIsPrimaryTopicOf());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for isPrimaryTopicOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for isPrimaryTopicOf tag ");
		}
		return SKIP_BODY;
	}
}

