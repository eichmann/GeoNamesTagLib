package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataTopic extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataTopic currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataTopic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RDFDataTopicIterator theRDFData = (RDFDataTopicIterator)findAncestorWithClass(this, RDFDataTopicIterator.class);
			pageContext.getOut().print(theRDFData.getTopic());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for topic tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for topic tag ");
		}
		return SKIP_BODY;
	}
}

