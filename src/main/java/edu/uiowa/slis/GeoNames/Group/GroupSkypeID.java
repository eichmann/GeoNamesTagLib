package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupSkypeID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupSkypeID currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupSkypeID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupSkypeIDIterator theGroup = (GroupSkypeIDIterator)findAncestorWithClass(this, GroupSkypeIDIterator.class);
			pageContext.getOut().print(theGroup.getSkypeID());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for skypeID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for skypeID tag ");
		}
		return SKIP_BODY;
	}
}

