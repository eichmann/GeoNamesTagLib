package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountFundedBy extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountFundedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountFundedBy.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountFundedByIterator theOnlineChatAccount = (OnlineChatAccountFundedByIterator)findAncestorWithClass(this, OnlineChatAccountFundedByIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getFundedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for fundedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for fundedBy tag ");
		}
		return SKIP_BODY;
	}
}

