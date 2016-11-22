package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupTipjar extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupTipjar currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupTipjar.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupTipjarIterator theGroup = (GroupTipjarIterator)findAncestorWithClass(this, GroupTipjarIterator.class);
			pageContext.getOut().print(theGroup.getTipjar());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for tipjar tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for tipjar tag ");
		}
		return SKIP_BODY;
	}
}

