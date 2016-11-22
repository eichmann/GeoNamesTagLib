package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupMbox_sha1sum extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupMbox_sha1sum currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupMbox_sha1sum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupMbox_sha1sumIterator theGroup = (GroupMbox_sha1sumIterator)findAncestorWithClass(this, GroupMbox_sha1sumIterator.class);
			pageContext.getOut().print(theGroup.getMbox_sha1sum());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for mbox_sha1sum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for mbox_sha1sum tag ");
		}
		return SKIP_BODY;
	}
}

