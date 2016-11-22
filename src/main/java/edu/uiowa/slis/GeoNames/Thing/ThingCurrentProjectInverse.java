package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingCurrentProjectInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingCurrentProjectInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingCurrentProjectInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingCurrentProjectInverseIterator theThingCurrentProjectInverseIterator = (ThingCurrentProjectInverseIterator)findAncestorWithClass(this, ThingCurrentProjectInverseIterator.class);
			pageContext.getOut().print(theThingCurrentProjectInverseIterator.getCurrentProjectInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for currentProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for currentProject tag ");
		}
		return SKIP_BODY;
	}
}

