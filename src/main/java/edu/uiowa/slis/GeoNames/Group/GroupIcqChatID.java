package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupIcqChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupIcqChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupIcqChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupIcqChatIDIterator theGroup = (GroupIcqChatIDIterator)findAncestorWithClass(this, GroupIcqChatIDIterator.class);
			pageContext.getOut().print(theGroup.getIcqChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for icqChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for icqChatID tag ");
		}
		return SKIP_BODY;
	}
}

