package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupInterest extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupInterest currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupInterest.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupInterestIterator theGroup = (GroupInterestIterator)findAncestorWithClass(this, GroupInterestIterator.class);
			pageContext.getOut().print(theGroup.getInterest());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for interest tag ");
		}
		return SKIP_BODY;
	}
}

