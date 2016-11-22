package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingTopObjectProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingTopObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingTopObjectProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingTopObjectPropertyIterator theThing = (ThingTopObjectPropertyIterator)findAncestorWithClass(this, ThingTopObjectPropertyIterator.class);
			pageContext.getOut().print(theThing.getTopObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

