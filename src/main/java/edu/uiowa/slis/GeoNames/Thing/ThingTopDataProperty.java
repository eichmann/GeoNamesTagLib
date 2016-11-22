package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingTopDataProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingTopDataPropertyIterator theThing = (ThingTopDataPropertyIterator)findAncestorWithClass(this, ThingTopDataPropertyIterator.class);
			pageContext.getOut().print(theThing.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

