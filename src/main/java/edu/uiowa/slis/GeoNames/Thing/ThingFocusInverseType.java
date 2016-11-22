package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingFocusInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingFocusInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingFocusInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingFocusInverseIterator theThingFocusInverseIterator = (ThingFocusInverseIterator)findAncestorWithClass(this, ThingFocusInverseIterator.class);
			pageContext.getOut().print(theThingFocusInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for focus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for focus tag ");
		}
		return SKIP_BODY;
	}
}

