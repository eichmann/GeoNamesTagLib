package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountBottomObjectProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountBottomObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountBottomObjectProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountBottomObjectPropertyIterator theOnlineAccount = (OnlineAccountBottomObjectPropertyIterator)findAncestorWithClass(this, OnlineAccountBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theOnlineAccount.getBottomObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

