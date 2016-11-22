package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPastProjectInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingPastProjectInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPastProjectInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingPastProjectInverseIterator theThingPastProjectInverseIterator = (ThingPastProjectInverseIterator)findAncestorWithClass(this, ThingPastProjectInverseIterator.class);
			pageContext.getOut().print(theThingPastProjectInverseIterator.getPastProjectInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for pastProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for pastProject tag ");
		}
		return SKIP_BODY;
	}
}

