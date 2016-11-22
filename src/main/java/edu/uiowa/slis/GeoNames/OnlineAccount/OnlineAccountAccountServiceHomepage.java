package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountAccountServiceHomepage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountAccountServiceHomepage currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountAccountServiceHomepage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountAccountServiceHomepageIterator theOnlineAccount = (OnlineAccountAccountServiceHomepageIterator)findAncestorWithClass(this, OnlineAccountAccountServiceHomepageIterator.class);
			pageContext.getOut().print(theOnlineAccount.getAccountServiceHomepage());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for accountServiceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for accountServiceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

