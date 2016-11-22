package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountDifferentFrom extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountDifferentFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountDifferentFrom.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountDifferentFromIterator theOnlineChatAccount = (OnlineChatAccountDifferentFromIterator)findAncestorWithClass(this, OnlineChatAccountDifferentFromIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getDifferentFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for differentFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for differentFrom tag ");
		}
		return SKIP_BODY;
	}
}

