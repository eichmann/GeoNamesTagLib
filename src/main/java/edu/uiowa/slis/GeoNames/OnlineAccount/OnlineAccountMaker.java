package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountMaker extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountMaker currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountMaker.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountMakerIterator theOnlineAccount = (OnlineAccountMakerIterator)findAncestorWithClass(this, OnlineAccountMakerIterator.class);
			pageContext.getOut().print(theOnlineAccount.getMaker());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for maker tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for maker tag ");
		}
		return SKIP_BODY;
	}
}

