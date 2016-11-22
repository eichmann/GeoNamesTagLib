package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingName currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingNameIterator theThing = (ThingNameIterator)findAncestorWithClass(this, ThingNameIterator.class);
			pageContext.getOut().print(theThing.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for name tag ");
		}
		return SKIP_BODY;
	}
}

