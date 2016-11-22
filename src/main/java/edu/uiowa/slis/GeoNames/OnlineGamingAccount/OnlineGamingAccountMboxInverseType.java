package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountMboxInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountMboxInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountMboxInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountMboxInverseIterator theOnlineGamingAccountMboxInverseIterator = (OnlineGamingAccountMboxInverseIterator)findAncestorWithClass(this, OnlineGamingAccountMboxInverseIterator.class);
			pageContext.getOut().print(theOnlineGamingAccountMboxInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for mbox tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for mbox tag ");
		}
		return SKIP_BODY;
	}
}

