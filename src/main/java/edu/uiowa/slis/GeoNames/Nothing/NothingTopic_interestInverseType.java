package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingTopic_interestInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingTopic_interestInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingTopic_interestInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NothingTopic_interestInverseIterator theNothingTopic_interestInverseIterator = (NothingTopic_interestInverseIterator)findAncestorWithClass(this, NothingTopic_interestInverseIterator.class);
			pageContext.getOut().print(theNothingTopic_interestInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for topic_interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for topic_interest tag ");
		}
		return SKIP_BODY;
	}
}

