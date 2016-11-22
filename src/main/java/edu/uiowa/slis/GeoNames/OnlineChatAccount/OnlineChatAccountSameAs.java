package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountSameAs extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountSameAsIterator theOnlineChatAccount = (OnlineChatAccountSameAsIterator)findAncestorWithClass(this, OnlineChatAccountSameAsIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

