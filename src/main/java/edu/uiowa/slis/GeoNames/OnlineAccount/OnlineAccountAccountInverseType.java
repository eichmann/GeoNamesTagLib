package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountAccountInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountAccountInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountAccountInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountAccountInverseIterator theOnlineAccountAccountInverseIterator = (OnlineAccountAccountInverseIterator)findAncestorWithClass(this, OnlineAccountAccountInverseIterator.class);
			pageContext.getOut().print(theOnlineAccountAccountInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for account tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for account tag ");
		}
		return SKIP_BODY;
	}
}

