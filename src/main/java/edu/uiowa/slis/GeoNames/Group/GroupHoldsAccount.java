package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupHoldsAccount extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupHoldsAccount currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupHoldsAccount.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupHoldsAccountIterator theGroup = (GroupHoldsAccountIterator)findAncestorWithClass(this, GroupHoldsAccountIterator.class);
			pageContext.getOut().print(theGroup.getHoldsAccount());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for holdsAccount tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for holdsAccount tag ");
		}
		return SKIP_BODY;
	}
}

