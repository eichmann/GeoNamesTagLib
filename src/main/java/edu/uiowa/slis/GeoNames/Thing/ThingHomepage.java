package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingHomepage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingHomepage currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingHomepage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingHomepageIterator theThing = (ThingHomepageIterator)findAncestorWithClass(this, ThingHomepageIterator.class);
			pageContext.getOut().print(theThing.getHomepage());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for homepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for homepage tag ");
		}
		return SKIP_BODY;
	}
}

