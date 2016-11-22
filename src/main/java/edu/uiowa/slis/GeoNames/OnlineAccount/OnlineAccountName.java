package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountName currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountNameIterator theOnlineAccount = (OnlineAccountNameIterator)findAncestorWithClass(this, OnlineAccountNameIterator.class);
			pageContext.getOut().print(theOnlineAccount.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for name tag ");
		}
		return SKIP_BODY;
	}
}

