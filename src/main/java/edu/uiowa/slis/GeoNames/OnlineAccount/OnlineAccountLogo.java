package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountLogo extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountLogo currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountLogo.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountLogoIterator theOnlineAccount = (OnlineAccountLogoIterator)findAncestorWithClass(this, OnlineAccountLogoIterator.class);
			pageContext.getOut().print(theOnlineAccount.getLogo());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for logo tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for logo tag ");
		}
		return SKIP_BODY;
	}
}

