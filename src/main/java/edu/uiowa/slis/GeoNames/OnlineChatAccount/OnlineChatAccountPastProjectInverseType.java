package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountPastProjectInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountPastProjectInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountPastProjectInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountPastProjectInverseIterator theOnlineChatAccountPastProjectInverseIterator = (OnlineChatAccountPastProjectInverseIterator)findAncestorWithClass(this, OnlineChatAccountPastProjectInverseIterator.class);
			pageContext.getOut().print(theOnlineChatAccountPastProjectInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for pastProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for pastProject tag ");
		}
		return SKIP_BODY;
	}
}

