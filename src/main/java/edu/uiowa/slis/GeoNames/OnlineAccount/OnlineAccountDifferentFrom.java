package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountDifferentFrom extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountDifferentFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountDifferentFrom.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountDifferentFromIterator theOnlineAccount = (OnlineAccountDifferentFromIterator)findAncestorWithClass(this, OnlineAccountDifferentFromIterator.class);
			pageContext.getOut().print(theOnlineAccount.getDifferentFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for differentFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for differentFrom tag ");
		}
		return SKIP_BODY;
	}
}

