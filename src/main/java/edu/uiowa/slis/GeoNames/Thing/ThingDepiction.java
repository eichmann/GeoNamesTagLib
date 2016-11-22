package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingDepiction extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingDepiction currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingDepiction.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingDepictionIterator theThing = (ThingDepictionIterator)findAncestorWithClass(this, ThingDepictionIterator.class);
			pageContext.getOut().print(theThing.getDepiction());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for depiction tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for depiction tag ");
		}
		return SKIP_BODY;
	}
}

