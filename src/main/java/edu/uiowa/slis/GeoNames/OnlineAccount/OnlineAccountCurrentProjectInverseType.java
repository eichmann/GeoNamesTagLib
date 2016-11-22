package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountCurrentProjectInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountCurrentProjectInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountCurrentProjectInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountCurrentProjectInverseIterator theOnlineAccountCurrentProjectInverseIterator = (OnlineAccountCurrentProjectInverseIterator)findAncestorWithClass(this, OnlineAccountCurrentProjectInverseIterator.class);
			pageContext.getOut().print(theOnlineAccountCurrentProjectInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for currentProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for currentProject tag ");
		}
		return SKIP_BODY;
	}
}

