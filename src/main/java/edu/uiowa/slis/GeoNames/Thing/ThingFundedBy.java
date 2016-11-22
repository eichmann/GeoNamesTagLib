package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingFundedBy extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingFundedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingFundedBy.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingFundedByIterator theThing = (ThingFundedByIterator)findAncestorWithClass(this, ThingFundedByIterator.class);
			pageContext.getOut().print(theThing.getFundedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for fundedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for fundedBy tag ");
		}
		return SKIP_BODY;
	}
}

