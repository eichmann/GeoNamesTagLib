package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupMbox extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupMbox currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupMbox.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupMboxIterator theGroup = (GroupMboxIterator)findAncestorWithClass(this, GroupMboxIterator.class);
			pageContext.getOut().print(theGroup.getMbox());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for mbox tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for mbox tag ");
		}
		return SKIP_BODY;
	}
}

