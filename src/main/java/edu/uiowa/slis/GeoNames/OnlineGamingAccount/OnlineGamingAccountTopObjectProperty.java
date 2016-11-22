package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountTopObjectProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountTopObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountTopObjectProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountTopObjectPropertyIterator theOnlineGamingAccount = (OnlineGamingAccountTopObjectPropertyIterator)findAncestorWithClass(this, OnlineGamingAccountTopObjectPropertyIterator.class);
			pageContext.getOut().print(theOnlineGamingAccount.getTopObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

