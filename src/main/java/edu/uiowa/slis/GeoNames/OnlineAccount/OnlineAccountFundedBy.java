package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountFundedBy extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountFundedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountFundedBy.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountFundedByIterator theOnlineAccount = (OnlineAccountFundedByIterator)findAncestorWithClass(this, OnlineAccountFundedByIterator.class);
			pageContext.getOut().print(theOnlineAccount.getFundedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for fundedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for fundedBy tag ");
		}
		return SKIP_BODY;
	}
}

