package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataInterestInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataInterestInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataInterestInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataInterestInverseIterator theRDFDataInterestInverseIterator = (RDFDataInterestInverseIterator)findAncestorWithClass(this, RDFDataInterestInverseIterator.class);
			pageContext.getOut().print(theRDFDataInterestInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for interest tag ");
		}
		return SKIP_BODY;
	}
}

