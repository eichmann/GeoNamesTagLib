package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountIsPrimaryTopicOf extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountIsPrimaryTopicOf currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountIsPrimaryTopicOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountIsPrimaryTopicOfIterator theOnlineAccount = (OnlineAccountIsPrimaryTopicOfIterator)findAncestorWithClass(this, OnlineAccountIsPrimaryTopicOfIterator.class);
			pageContext.getOut().print(theOnlineAccount.getIsPrimaryTopicOf());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for isPrimaryTopicOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for isPrimaryTopicOf tag ");
		}
		return SKIP_BODY;
	}
}

