package edu.uiowa.slis.GeoNames.OnlineEcommerceAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineEcommerceAccountLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineEcommerceAccountLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineEcommerceAccountLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OnlineEcommerceAccount theOnlineEcommerceAccount = (OnlineEcommerceAccount)findAncestorWithClass(this, OnlineEcommerceAccount.class);
			if (!theOnlineEcommerceAccount.commitNeeded) {
				pageContext.getOut().print(theOnlineEcommerceAccount.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OnlineEcommerceAccount theOnlineEcommerceAccount = (OnlineEcommerceAccount)findAncestorWithClass(this, OnlineEcommerceAccount.class);
			return theOnlineEcommerceAccount.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OnlineEcommerceAccount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OnlineEcommerceAccount theOnlineEcommerceAccount = (OnlineEcommerceAccount)findAncestorWithClass(this, OnlineEcommerceAccount.class);
			theOnlineEcommerceAccount.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineEcommerceAccount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineEcommerceAccount for label tag ");
		}
	}
}

