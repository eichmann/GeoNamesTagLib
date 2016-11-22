package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPastProjectInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingPastProjectInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPastProjectInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingPastProjectInverseIterator theThingPastProjectInverseIterator = (ThingPastProjectInverseIterator)findAncestorWithClass(this, ThingPastProjectInverseIterator.class);
			pageContext.getOut().print(theThingPastProjectInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for pastProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for pastProject tag ");
		}
		return SKIP_BODY;
	}
}

