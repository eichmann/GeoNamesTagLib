package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountAccountInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountAccountInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountAccountInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountAccountInverseIterator theOnlineChatAccountAccountInverseIterator = (OnlineChatAccountAccountInverseIterator)findAncestorWithClass(this, OnlineChatAccountAccountInverseIterator.class);
			pageContext.getOut().print(theOnlineChatAccountAccountInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for account tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for account tag ");
		}
		return SKIP_BODY;
	}
}

