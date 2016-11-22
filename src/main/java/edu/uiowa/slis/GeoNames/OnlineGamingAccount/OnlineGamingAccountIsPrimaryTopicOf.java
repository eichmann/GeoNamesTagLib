package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountIsPrimaryTopicOf extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountIsPrimaryTopicOf currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountIsPrimaryTopicOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountIsPrimaryTopicOfIterator theOnlineGamingAccount = (OnlineGamingAccountIsPrimaryTopicOfIterator)findAncestorWithClass(this, OnlineGamingAccountIsPrimaryTopicOfIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getIsPrimaryTopicOf());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for isPrimaryTopicOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for isPrimaryTopicOf tag ");
		}
		return SKIP_BODY;
	}
}

