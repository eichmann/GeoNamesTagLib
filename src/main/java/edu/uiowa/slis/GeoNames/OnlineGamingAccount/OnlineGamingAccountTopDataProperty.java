package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountTopDataProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountTopDataPropertyIterator theOnlineGamingAccount = (OnlineGamingAccountTopDataPropertyIterator)findAncestorWithClass(this, OnlineGamingAccountTopDataPropertyIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

