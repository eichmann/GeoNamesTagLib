package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountBottomDataProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountBottomDataPropertyIterator theOnlineChatAccount = (OnlineChatAccountBottomDataPropertyIterator)findAncestorWithClass(this, OnlineChatAccountBottomDataPropertyIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

