package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataWorkInfoHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataWorkInfoHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataWorkInfoHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataWorkInfoHomepageInverseIterator theRDFDataWorkInfoHomepageInverseIterator = (RDFDataWorkInfoHomepageInverseIterator)findAncestorWithClass(this, RDFDataWorkInfoHomepageInverseIterator.class);
			pageContext.getOut().print(theRDFDataWorkInfoHomepageInverseIterator.getWorkInfoHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for workInfoHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for workInfoHomepage tag ");
		}
		return SKIP_BODY;
	}
}
