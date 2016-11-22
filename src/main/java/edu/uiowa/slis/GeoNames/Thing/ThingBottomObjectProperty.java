package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingBottomObjectProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingBottomObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingBottomObjectProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingBottomObjectPropertyIterator theThing = (ThingBottomObjectPropertyIterator)findAncestorWithClass(this, ThingBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theThing.getBottomObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

