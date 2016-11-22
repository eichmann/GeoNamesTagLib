package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountAccountInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountAccountInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountAccountInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountAccountInverseIterator theOnlineAccountAccountInverseIterator = (OnlineAccountAccountInverseIterator)findAncestorWithClass(this, OnlineAccountAccountInverseIterator.class);
			pageContext.getOut().print(theOnlineAccountAccountInverseIterator.getAccountInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for account tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for account tag ");
		}
		return SKIP_BODY;
	}
}

