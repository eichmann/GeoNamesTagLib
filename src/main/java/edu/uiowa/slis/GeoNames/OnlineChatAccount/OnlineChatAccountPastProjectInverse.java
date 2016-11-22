package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountPastProjectInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountPastProjectInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountPastProjectInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountPastProjectInverseIterator theOnlineChatAccountPastProjectInverseIterator = (OnlineChatAccountPastProjectInverseIterator)findAncestorWithClass(this, OnlineChatAccountPastProjectInverseIterator.class);
			pageContext.getOut().print(theOnlineChatAccountPastProjectInverseIterator.getPastProjectInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for pastProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for pastProject tag ");
		}
		return SKIP_BODY;
	}
}

