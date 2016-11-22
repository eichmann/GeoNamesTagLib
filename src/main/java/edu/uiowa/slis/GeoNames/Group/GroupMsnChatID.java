package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupMsnChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupMsnChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupMsnChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupMsnChatIDIterator theGroup = (GroupMsnChatIDIterator)findAncestorWithClass(this, GroupMsnChatIDIterator.class);
			pageContext.getOut().print(theGroup.getMsnChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for msnChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for msnChatID tag ");
		}
		return SKIP_BODY;
	}
}

