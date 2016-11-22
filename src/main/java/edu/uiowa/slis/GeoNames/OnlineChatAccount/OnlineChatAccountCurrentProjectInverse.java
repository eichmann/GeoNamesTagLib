package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountCurrentProjectInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountCurrentProjectInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountCurrentProjectInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountCurrentProjectInverseIterator theOnlineChatAccountCurrentProjectInverseIterator = (OnlineChatAccountCurrentProjectInverseIterator)findAncestorWithClass(this, OnlineChatAccountCurrentProjectInverseIterator.class);
			pageContext.getOut().print(theOnlineChatAccountCurrentProjectInverseIterator.getCurrentProjectInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for currentProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for currentProject tag ");
		}
		return SKIP_BODY;
	}
}

