package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountMboxInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountMboxInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountMboxInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountMboxInverseIterator theOnlineChatAccountMboxInverseIterator = (OnlineChatAccountMboxInverseIterator)findAncestorWithClass(this, OnlineChatAccountMboxInverseIterator.class);
			pageContext.getOut().print(theOnlineChatAccountMboxInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for mbox tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for mbox tag ");
		}
		return SKIP_BODY;
	}
}

