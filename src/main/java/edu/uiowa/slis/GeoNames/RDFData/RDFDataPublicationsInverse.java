package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataPublicationsInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataPublicationsInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataPublicationsInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataPublicationsInverseIterator theRDFDataPublicationsInverseIterator = (RDFDataPublicationsInverseIterator)findAncestorWithClass(this, RDFDataPublicationsInverseIterator.class);
			pageContext.getOut().print(theRDFDataPublicationsInverseIterator.getPublicationsInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for publications tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for publications tag ");
		}
		return SKIP_BODY;
	}
}

