package edu.uiowa.slis.GeoNames.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionMember extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CollectionMember currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionMember.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CollectionMemberIterator theCollection = (CollectionMemberIterator)findAncestorWithClass(this, CollectionMemberIterator.class);
			pageContext.getOut().print(theCollection.getMember());
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for member tag ");
		}
		return SKIP_BODY;
	}
}

