package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountDepiction extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountDepiction currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountDepiction.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountDepictionIterator theOnlineAccount = (OnlineAccountDepictionIterator)findAncestorWithClass(this, OnlineAccountDepictionIterator.class);
			pageContext.getOut().print(theOnlineAccount.getDepiction());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for depiction tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for depiction tag ");
		}
		return SKIP_BODY;
	}
}

