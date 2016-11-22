package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OnlineAccount theOnlineAccount = (OnlineAccount)findAncestorWithClass(this, OnlineAccount.class);
			if (!theOnlineAccount.commitNeeded) {
				pageContext.getOut().print(theOnlineAccount.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OnlineAccount theOnlineAccount = (OnlineAccount)findAncestorWithClass(this, OnlineAccount.class);
			return theOnlineAccount.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OnlineAccount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OnlineAccount theOnlineAccount = (OnlineAccount)findAncestorWithClass(this, OnlineAccount.class);
			theOnlineAccount.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for label tag ");
		}
	}
}

