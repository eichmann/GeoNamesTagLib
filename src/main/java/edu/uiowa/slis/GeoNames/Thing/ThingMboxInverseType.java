package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingMboxInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingMboxInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingMboxInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingMboxInverseIterator theThingMboxInverseIterator = (ThingMboxInverseIterator)findAncestorWithClass(this, ThingMboxInverseIterator.class);
			pageContext.getOut().print(theThingMboxInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for mbox tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for mbox tag ");
		}
		return SKIP_BODY;
	}
}

