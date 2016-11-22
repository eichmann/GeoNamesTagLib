package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountTopDataProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountTopDataPropertyIterator theOnlineAccount = (OnlineAccountTopDataPropertyIterator)findAncestorWithClass(this, OnlineAccountTopDataPropertyIterator.class);
			pageContext.getOut().print(theOnlineAccount.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

