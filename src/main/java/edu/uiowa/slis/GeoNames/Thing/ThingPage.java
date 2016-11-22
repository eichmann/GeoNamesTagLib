package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingPage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingPage currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingPage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingPageIterator theThing = (ThingPageIterator)findAncestorWithClass(this, ThingPageIterator.class);
			pageContext.getOut().print(theThing.getPage());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for page tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for page tag ");
		}
		return SKIP_BODY;
	}
}

