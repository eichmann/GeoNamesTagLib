package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupWeblog extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupWeblog currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupWeblog.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupWeblogIterator theGroup = (GroupWeblogIterator)findAncestorWithClass(this, GroupWeblogIterator.class);
			pageContext.getOut().print(theGroup.getWeblog());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for weblog tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for weblog tag ");
		}
		return SKIP_BODY;
	}
}

