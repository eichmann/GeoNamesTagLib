package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingIsPrimaryTopicOf extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingIsPrimaryTopicOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingIsPrimaryTopicOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThingIsPrimaryTopicOfIterator theThing = (ThingIsPrimaryTopicOfIterator)findAncestorWithClass(this, ThingIsPrimaryTopicOfIterator.class);
			pageContext.getOut().print(theThing.getIsPrimaryTopicOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for isPrimaryTopicOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for isPrimaryTopicOf tag ");
		}
		return SKIP_BODY;
	}
}

