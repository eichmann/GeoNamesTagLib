package edu.uiowa.slis.GeoNames.OrderedCollection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrderedCollectionMemberList extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrderedCollectionMemberList currentInstance = null;
	private static final Log log = LogFactory.getLog(OrderedCollectionMemberList.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrderedCollectionMemberListIterator theOrderedCollection = (OrderedCollectionMemberListIterator)findAncestorWithClass(this, OrderedCollectionMemberListIterator.class);
			pageContext.getOut().print(theOrderedCollection.getMemberList());
		} catch (Exception e) {
			log.error("Can't find enclosing OrderedCollection for memberList tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrderedCollection for memberList tag ");
		}
		return SKIP_BODY;
	}
}

