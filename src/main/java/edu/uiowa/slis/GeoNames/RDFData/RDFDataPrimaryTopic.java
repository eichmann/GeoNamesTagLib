package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataPrimaryTopic extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataPrimaryTopic currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataPrimaryTopic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RDFDataPrimaryTopicIterator theRDFData = (RDFDataPrimaryTopicIterator)findAncestorWithClass(this, RDFDataPrimaryTopicIterator.class);
			pageContext.getOut().print(theRDFData.getPrimaryTopic());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for primaryTopic tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for primaryTopic tag ");
		}
		return SKIP_BODY;
	}
}

