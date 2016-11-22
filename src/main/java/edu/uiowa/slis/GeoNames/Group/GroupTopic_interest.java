package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupTopic_interest extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupTopic_interest currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupTopic_interest.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GroupTopic_interestIterator theGroup = (GroupTopic_interestIterator)findAncestorWithClass(this, GroupTopic_interestIterator.class);
			pageContext.getOut().print(theGroup.getTopic_interest());
		} catch (Exception e) {
			log.error("Can't find enclosing Group for topic_interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for topic_interest tag ");
		}
		return SKIP_BODY;
	}
}

