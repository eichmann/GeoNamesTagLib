package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountPage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountPage currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountPage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountPageIterator theOnlineAccount = (OnlineAccountPageIterator)findAncestorWithClass(this, OnlineAccountPageIterator.class);
			pageContext.getOut().print(theOnlineAccount.getPage());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for page tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for page tag ");
		}
		return SKIP_BODY;
	}
}

