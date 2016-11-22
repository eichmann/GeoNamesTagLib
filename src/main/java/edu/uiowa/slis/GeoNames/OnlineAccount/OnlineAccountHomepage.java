package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountHomepage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountHomepage currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountHomepage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountHomepageIterator theOnlineAccount = (OnlineAccountHomepageIterator)findAncestorWithClass(this, OnlineAccountHomepageIterator.class);
			pageContext.getOut().print(theOnlineAccount.getHomepage());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for homepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for homepage tag ");
		}
		return SKIP_BODY;
	}
}

