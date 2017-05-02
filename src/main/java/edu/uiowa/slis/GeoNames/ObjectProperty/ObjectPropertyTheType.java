package edu.uiowa.slis.GeoNames.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyTheType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ObjectPropertyTheType currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyTheType.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyTheTypeIterator theObjectProperty = (ObjectPropertyTheTypeIterator)findAncestorWithClass(this, ObjectPropertyTheTypeIterator.class);
			pageContext.getOut().print(theObjectProperty.getTheType());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for theType tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for theType tag ");
		}
		return SKIP_BODY;
	}
}

