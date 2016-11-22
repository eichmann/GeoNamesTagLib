package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupMember extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupMember currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupMember.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupMemberIterator theGroup = (GroupMemberIterator)findAncestorWithClass(this, GroupMemberIterator.class);
			pageContext.getOut().print(theGroup.getMember());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for member tag ");
		}
		return SKIP_BODY;
	}
}

