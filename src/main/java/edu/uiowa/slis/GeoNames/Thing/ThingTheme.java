package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingTheme extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingTheme currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingTheme.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingThemeIterator theThing = (ThingThemeIterator)findAncestorWithClass(this, ThingThemeIterator.class);
			pageContext.getOut().print(theThing.getTheme());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for theme tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for theme tag ");
		}
		return SKIP_BODY;
	}
}

