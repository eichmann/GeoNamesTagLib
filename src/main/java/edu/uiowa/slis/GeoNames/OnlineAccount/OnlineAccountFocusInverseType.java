package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountFocusInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountFocusInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountFocusInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountFocusInverseIterator theOnlineAccountFocusInverseIterator = (OnlineAccountFocusInverseIterator)findAncestorWithClass(this, OnlineAccountFocusInverseIterator.class);
			pageContext.getOut().print(theOnlineAccountFocusInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for focus tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for focus tag ");
		}
		return SKIP_BODY;
	}
}

