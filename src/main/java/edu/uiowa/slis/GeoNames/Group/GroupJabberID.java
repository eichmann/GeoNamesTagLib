package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupJabberID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupJabberID currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupJabberID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupJabberIDIterator theGroup = (GroupJabberIDIterator)findAncestorWithClass(this, GroupJabberIDIterator.class);
			pageContext.getOut().print(theGroup.getJabberID());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for jabberID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for jabberID tag ");
		}
		return SKIP_BODY;
	}
}

