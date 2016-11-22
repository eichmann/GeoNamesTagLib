package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccount theOnlineChatAccount = (OnlineChatAccount)findAncestorWithClass(this, OnlineChatAccount.class);
			if (!theOnlineChatAccount.commitNeeded) {
				pageContext.getOut().print(theOnlineChatAccount.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OnlineChatAccount theOnlineChatAccount = (OnlineChatAccount)findAncestorWithClass(this, OnlineChatAccount.class);
			return theOnlineChatAccount.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OnlineChatAccount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OnlineChatAccount theOnlineChatAccount = (OnlineChatAccount)findAncestorWithClass(this, OnlineChatAccount.class);
			theOnlineChatAccount.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for label tag ");
		}
	}
}

