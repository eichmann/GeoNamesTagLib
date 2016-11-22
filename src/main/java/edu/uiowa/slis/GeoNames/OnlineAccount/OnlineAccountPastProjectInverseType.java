package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountPastProjectInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountPastProjectInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountPastProjectInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountPastProjectInverseIterator theOnlineAccountPastProjectInverseIterator = (OnlineAccountPastProjectInverseIterator)findAncestorWithClass(this, OnlineAccountPastProjectInverseIterator.class);
			pageContext.getOut().print(theOnlineAccountPastProjectInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for pastProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for pastProject tag ");
		}
		return SKIP_BODY;
	}
}

