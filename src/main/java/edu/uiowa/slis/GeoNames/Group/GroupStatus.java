package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupStatus extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupStatus.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupStatusIterator theGroup = (GroupStatusIterator)findAncestorWithClass(this, GroupStatusIterator.class);
			pageContext.getOut().print(theGroup.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for status tag ");
		}
		return SKIP_BODY;
	}
}

