package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountTopObjectProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountTopObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountTopObjectProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountTopObjectPropertyIterator theOnlineChatAccount = (OnlineChatAccountTopObjectPropertyIterator)findAncestorWithClass(this, OnlineChatAccountTopObjectPropertyIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getTopObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

