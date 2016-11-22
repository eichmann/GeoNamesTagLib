package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupOpenid extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupOpenid currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupOpenid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupOpenidIterator theGroup = (GroupOpenidIterator)findAncestorWithClass(this, GroupOpenidIterator.class);
			pageContext.getOut().print(theGroup.getOpenid());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for openid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for openid tag ");
		}
		return SKIP_BODY;
	}
}

