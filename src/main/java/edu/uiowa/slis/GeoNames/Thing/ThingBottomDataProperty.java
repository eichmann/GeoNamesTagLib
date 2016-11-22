package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingBottomDataProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingBottomDataPropertyIterator theThing = (ThingBottomDataPropertyIterator)findAncestorWithClass(this, ThingBottomDataPropertyIterator.class);
			pageContext.getOut().print(theThing.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

