package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupMade extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupMade currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupMade.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupMadeIterator theGroup = (GroupMadeIterator)findAncestorWithClass(this, GroupMadeIterator.class);
			pageContext.getOut().print(theGroup.getMade());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for made tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for made tag ");
		}
		return SKIP_BODY;
	}
}

