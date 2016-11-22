package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountLogo extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountLogo currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountLogo.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountLogoIterator theOnlineChatAccount = (OnlineChatAccountLogoIterator)findAncestorWithClass(this, OnlineChatAccountLogoIterator.class);
			pageContext.getOut().print(theOnlineChatAccount.getLogo());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for logo tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for logo tag ");
		}
		return SKIP_BODY;
	}
}

