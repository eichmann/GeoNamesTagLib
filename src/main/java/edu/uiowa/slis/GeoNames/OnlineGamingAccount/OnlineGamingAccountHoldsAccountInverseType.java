package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountHoldsAccountInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountHoldsAccountInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountHoldsAccountInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountHoldsAccountInverseIterator theOnlineGamingAccountHoldsAccountInverseIterator = (OnlineGamingAccountHoldsAccountInverseIterator)findAncestorWithClass(this, OnlineGamingAccountHoldsAccountInverseIterator.class);
			pageContext.getOut().print(theOnlineGamingAccountHoldsAccountInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for holdsAccount tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for holdsAccount tag ");
		}
		return SKIP_BODY;
	}
}

