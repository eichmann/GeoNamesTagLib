package edu.uiowa.slis.GeoNames.OnlineGamingAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineGamingAccountLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineGamingAccountLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineGamingAccountLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OnlineGamingAccount theOnlineGamingAccount = (OnlineGamingAccount)findAncestorWithClass(this, OnlineGamingAccount.class);
			if (!theOnlineGamingAccount.commitNeeded) {
				pageContext.getOut().print(theOnlineGamingAccount.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OnlineGamingAccount theOnlineGamingAccount = (OnlineGamingAccount)findAncestorWithClass(this, OnlineGamingAccount.class);
			return theOnlineGamingAccount.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OnlineGamingAccount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OnlineGamingAccount theOnlineGamingAccount = (OnlineGamingAccount)findAncestorWithClass(this, OnlineGamingAccount.class);
			theOnlineGamingAccount.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineGamingAccount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineGamingAccount for label tag ");
		}
	}
}

