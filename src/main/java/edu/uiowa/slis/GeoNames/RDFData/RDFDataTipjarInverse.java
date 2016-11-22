package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataTipjarInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataTipjarInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataTipjarInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataTipjarInverseIterator theRDFDataTipjarInverseIterator = (RDFDataTipjarInverseIterator)findAncestorWithClass(this, RDFDataTipjarInverseIterator.class);
			pageContext.getOut().print(theRDFDataTipjarInverseIterator.getTipjarInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for tipjar tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for tipjar tag ");
		}
		return SKIP_BODY;
	}
}

