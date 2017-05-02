package edu.uiowa.slis.GeoNames.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertyLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ObjectPropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertyLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ObjectPropertyLabelIterator theObjectProperty = (ObjectPropertyLabelIterator)findAncestorWithClass(this, ObjectPropertyLabelIterator.class);
			pageContext.getOut().print(theObjectProperty.getLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for label tag ");
		}
		return SKIP_BODY;
	}
}

