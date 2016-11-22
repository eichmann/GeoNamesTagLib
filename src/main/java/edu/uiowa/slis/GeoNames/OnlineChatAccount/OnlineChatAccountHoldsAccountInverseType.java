package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountHoldsAccountInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountHoldsAccountInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountHoldsAccountInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountHoldsAccountInverseIterator theOnlineChatAccountHoldsAccountInverseIterator = (OnlineChatAccountHoldsAccountInverseIterator)findAncestorWithClass(this, OnlineChatAccountHoldsAccountInverseIterator.class);
			pageContext.getOut().print(theOnlineChatAccountHoldsAccountInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for holdsAccount tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for holdsAccount tag ");
		}
		return SKIP_BODY;
	}
}

