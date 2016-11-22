package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountBottomObjectProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountBottomObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountBottomObjectProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountBottomObjectPropertyIterator theOnlineChatAccount = (OnlineChatAccountBottomObjectPropertyIterator)findAncestorWithClass(this, OnlineChatAccountBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getBottomObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

