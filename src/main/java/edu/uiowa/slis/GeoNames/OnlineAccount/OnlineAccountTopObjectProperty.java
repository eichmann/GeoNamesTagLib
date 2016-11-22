package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountTopObjectProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountTopObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountTopObjectProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountTopObjectPropertyIterator theOnlineAccount = (OnlineAccountTopObjectPropertyIterator)findAncestorWithClass(this, OnlineAccountTopObjectPropertyIterator.class);
			pageContext.getOut().print(theOnlineAccount.getTopObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

