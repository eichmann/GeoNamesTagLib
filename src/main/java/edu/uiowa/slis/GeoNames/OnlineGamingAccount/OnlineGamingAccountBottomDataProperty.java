package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountBottomDataProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountBottomDataPropertyIterator theOnlineGamingAccount = (OnlineGamingAccountBottomDataPropertyIterator)findAncestorWithClass(this, OnlineGamingAccountBottomDataPropertyIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

