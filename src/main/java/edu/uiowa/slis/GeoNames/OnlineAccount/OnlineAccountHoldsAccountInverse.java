package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountHoldsAccountInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountHoldsAccountInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountHoldsAccountInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountHoldsAccountInverseIterator theOnlineAccountHoldsAccountInverseIterator = (OnlineAccountHoldsAccountInverseIterator)findAncestorWithClass(this, OnlineAccountHoldsAccountInverseIterator.class);
			pageContext.getOut().print(theOnlineAccountHoldsAccountInverseIterator.getHoldsAccountInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for holdsAccount tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for holdsAccount tag ");
		}
		return SKIP_BODY;
	}
}

