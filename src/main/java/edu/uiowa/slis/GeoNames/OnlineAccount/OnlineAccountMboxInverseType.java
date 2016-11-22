package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountMboxInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountMboxInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountMboxInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountMboxInverseIterator theOnlineAccountMboxInverseIterator = (OnlineAccountMboxInverseIterator)findAncestorWithClass(this, OnlineAccountMboxInverseIterator.class);
			pageContext.getOut().print(theOnlineAccountMboxInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for mbox tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for mbox tag ");
		}
		return SKIP_BODY;
	}
}

