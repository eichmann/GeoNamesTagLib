package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountCurrentProjectInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountCurrentProjectInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountCurrentProjectInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccountCurrentProjectInverseIterator theOnlineGamingAccountCurrentProjectInverseIterator = (OnlineGamingAccountCurrentProjectInverseIterator)findAncestorWithClass(this, OnlineGamingAccountCurrentProjectInverseIterator.class);
			pageContext.getOut().print(theOnlineGamingAccountCurrentProjectInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for currentProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for currentProject tag ");
		}
		return SKIP_BODY;
	}
}

