package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountIsPrimaryTopicOf extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountIsPrimaryTopicOf currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountIsPrimaryTopicOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountIsPrimaryTopicOfIterator theOnlineChatAccount = (OnlineChatAccountIsPrimaryTopicOfIterator)findAncestorWithClass(this, OnlineChatAccountIsPrimaryTopicOfIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getIsPrimaryTopicOf());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for isPrimaryTopicOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for isPrimaryTopicOf tag ");
		}
		return SKIP_BODY;
	}
}

