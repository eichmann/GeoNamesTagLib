package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingTopic_interestInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingTopic_interestInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingTopic_interestInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThingTopic_interestInverseIterator theThingTopic_interestInverseIterator = (ThingTopic_interestInverseIterator)findAncestorWithClass(this, ThingTopic_interestInverseIterator.class);
			pageContext.getOut().print(theThingTopic_interestInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for topic_interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for topic_interest tag ");
		}
		return SKIP_BODY;
	}
}

