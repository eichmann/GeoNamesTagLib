package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountMaker extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountMaker currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountMaker.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountMakerIterator theOnlineChatAccount = (OnlineChatAccountMakerIterator)findAncestorWithClass(this, OnlineChatAccountMakerIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getMaker());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for maker tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for maker tag ");
		}
		return SKIP_BODY;
	}
}

