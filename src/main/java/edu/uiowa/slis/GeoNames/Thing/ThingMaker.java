package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingMaker extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingMaker currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingMaker.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingMakerIterator theThing = (ThingMakerIterator)findAncestorWithClass(this, ThingMakerIterator.class);
			pageContext.getOut().print(theThing.getMaker());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for maker tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for maker tag ");
		}
		return SKIP_BODY;
	}
}

