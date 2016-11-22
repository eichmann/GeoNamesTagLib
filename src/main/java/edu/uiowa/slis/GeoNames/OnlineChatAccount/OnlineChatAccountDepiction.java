package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountDepiction extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountDepiction currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountDepiction.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountDepictionIterator theOnlineChatAccount = (OnlineChatAccountDepictionIterator)findAncestorWithClass(this, OnlineChatAccountDepictionIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getDepiction());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for depiction tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for depiction tag ");
		}
		return SKIP_BODY;
	}
}

