package edu.uiowa.slis.GeoNames.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyComment extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ObjectPropertyComment currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyComment.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyCommentIterator theObjectProperty = (ObjectPropertyCommentIterator)findAncestorWithClass(this, ObjectPropertyCommentIterator.class);
			pageContext.getOut().print(theObjectProperty.getComment());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for comment tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for comment tag ");
		}
		return SKIP_BODY;
	}
}

