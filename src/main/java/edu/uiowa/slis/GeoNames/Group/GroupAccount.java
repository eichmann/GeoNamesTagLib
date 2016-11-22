package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupAccount extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupAccount currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupAccount.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupAccountIterator theGroup = (GroupAccountIterator)findAncestorWithClass(this, GroupAccountIterator.class);
			pageContext.getOut().print(theGroup.getAccount());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for account tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for account tag ");
		}
		return SKIP_BODY;
	}
}

