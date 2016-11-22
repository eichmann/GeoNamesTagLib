package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountCurrentProjectInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountCurrentProjectInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountCurrentProjectInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccountCurrentProjectInverseIterator theOnlineEcommerceAccountCurrentProjectInverseIterator = (OnlineEcommerceAccountCurrentProjectInverseIterator)findAncestorWithClass(this, OnlineEcommerceAccountCurrentProjectInverseIterator.class);
			pageContext.getOut().print(theOnlineEcommerceAccountCurrentProjectInverseIterator.getCurrentProjectInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for currentProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for currentProject tag ");
		}
		return SKIP_BODY;
	}
}

