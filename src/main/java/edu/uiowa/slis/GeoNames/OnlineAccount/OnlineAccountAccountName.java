package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountAccountName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountAccountName currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountAccountName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountAccountNameIterator theOnlineAccount = (OnlineAccountAccountNameIterator)findAncestorWithClass(this, OnlineAccountAccountNameIterator.class);
			pageContext.getOut().print(theOnlineAccount.getAccountName());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for accountName tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for accountName tag ");
		}
		return SKIP_BODY;
	}
}

