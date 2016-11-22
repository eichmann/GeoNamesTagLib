package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataWeblogInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataWeblogInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataWeblogInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataWeblogInverseIterator theRDFDataWeblogInverseIterator = (RDFDataWeblogInverseIterator)findAncestorWithClass(this, RDFDataWeblogInverseIterator.class);
			pageContext.getOut().print(theRDFDataWeblogInverseIterator.getWeblogInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for weblog tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for weblog tag ");
		}
		return SKIP_BODY;
	}
}

