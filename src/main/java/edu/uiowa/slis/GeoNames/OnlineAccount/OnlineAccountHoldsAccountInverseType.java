package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountHoldsAccountInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountHoldsAccountInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountHoldsAccountInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountHoldsAccountInverseIterator theOnlineAccountHoldsAccountInverseIterator = (OnlineAccountHoldsAccountInverseIterator)findAncestorWithClass(this, OnlineAccountHoldsAccountInverseIterator.class);
			pageContext.getOut().print(theOnlineAccountHoldsAccountInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for holdsAccount tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for holdsAccount tag ");
		}
		return SKIP_BODY;
	}
}

