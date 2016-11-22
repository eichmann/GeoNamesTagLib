package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountBottomObjectProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountBottomObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountBottomObjectProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountBottomObjectPropertyIterator theOnlineGamingAccount = (OnlineGamingAccountBottomObjectPropertyIterator)findAncestorWithClass(this, OnlineGamingAccountBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getBottomObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

