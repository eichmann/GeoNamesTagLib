package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountSameAs extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountSameAsIterator theOnlineAccount = (OnlineAccountSameAsIterator)findAncestorWithClass(this, OnlineAccountSameAsIterator.class);
			pageContext.getOut().print(theOnlineAccount.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

