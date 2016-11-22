package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupYahooChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupYahooChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupYahooChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupYahooChatIDIterator theGroup = (GroupYahooChatIDIterator)findAncestorWithClass(this, GroupYahooChatIDIterator.class);
			pageContext.getOut().print(theGroup.getYahooChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for yahooChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for yahooChatID tag ");
		}
		return SKIP_BODY;
	}
}

