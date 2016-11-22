package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountBottomDataProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountBottomDataPropertyIterator theOnlineAccount = (OnlineAccountBottomDataPropertyIterator)findAncestorWithClass(this, OnlineAccountBottomDataPropertyIterator.class);
			pageContext.getOut().print(theOnlineAccount.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

