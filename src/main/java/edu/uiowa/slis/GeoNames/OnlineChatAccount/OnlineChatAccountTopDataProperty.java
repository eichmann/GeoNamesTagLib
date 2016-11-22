package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountTopDataProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountTopDataPropertyIterator theOnlineChatAccount = (OnlineChatAccountTopDataPropertyIterator)findAncestorWithClass(this, OnlineChatAccountTopDataPropertyIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

