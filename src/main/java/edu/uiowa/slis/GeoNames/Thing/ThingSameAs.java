package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingSameAs extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingSameAsIterator theThing = (ThingSameAsIterator)findAncestorWithClass(this, ThingSameAsIterator.class);
			pageContext.getOut().print(theThing.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

