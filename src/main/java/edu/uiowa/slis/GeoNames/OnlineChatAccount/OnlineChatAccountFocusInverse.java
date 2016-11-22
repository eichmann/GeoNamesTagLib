package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountFocusInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountFocusInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountFocusInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountFocusInverseIterator theOnlineChatAccountFocusInverseIterator = (OnlineChatAccountFocusInverseIterator)findAncestorWithClass(this, OnlineChatAccountFocusInverseIterator.class);
			pageContext.getOut().print(theOnlineChatAccountFocusInverseIterator.getFocusInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for focus tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for focus tag ");
		}
		return SKIP_BODY;
	}
}

