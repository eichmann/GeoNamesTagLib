package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataInterestInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataInterestInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataInterestInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataInterestInverseIterator theRDFDataInterestInverseIterator = (RDFDataInterestInverseIterator)findAncestorWithClass(this, RDFDataInterestInverseIterator.class);
			pageContext.getOut().print(theRDFDataInterestInverseIterator.getInterestInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for interest tag ");
		}
		return SKIP_BODY;
	}
}

