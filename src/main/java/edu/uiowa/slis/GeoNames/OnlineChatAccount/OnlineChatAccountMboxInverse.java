package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountMboxInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountMboxInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountMboxInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountMboxInverseIterator theOnlineChatAccountMboxInverseIterator = (OnlineChatAccountMboxInverseIterator)findAncestorWithClass(this, OnlineChatAccountMboxInverseIterator.class);
			pageContext.getOut().print(theOnlineChatAccountMboxInverseIterator.getMboxInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for mbox tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for mbox tag ");
		}
		return SKIP_BODY;
	}
}

