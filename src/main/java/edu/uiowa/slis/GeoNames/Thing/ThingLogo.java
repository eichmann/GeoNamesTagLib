package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingLogo extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingLogo currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingLogo.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingLogoIterator theThing = (ThingLogoIterator)findAncestorWithClass(this, ThingLogoIterator.class);
			pageContext.getOut().print(theThing.getLogo());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for logo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for logo tag ");
		}
		return SKIP_BODY;
	}
}

