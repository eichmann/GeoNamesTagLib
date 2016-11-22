package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingDifferentFrom extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingDifferentFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingDifferentFrom.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingDifferentFromIterator theThing = (ThingDifferentFromIterator)findAncestorWithClass(this, ThingDifferentFromIterator.class);
			pageContext.getOut().print(theThing.getDifferentFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for differentFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for differentFrom tag ");
		}
		return SKIP_BODY;
	}
}

