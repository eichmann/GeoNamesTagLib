package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataWorkplaceHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataWorkplaceHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataWorkplaceHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataWorkplaceHomepageInverseIterator theRDFDataWorkplaceHomepageInverseIterator = (RDFDataWorkplaceHomepageInverseIterator)findAncestorWithClass(this, RDFDataWorkplaceHomepageInverseIterator.class);
			pageContext.getOut().print(theRDFDataWorkplaceHomepageInverseIterator.getWorkplaceHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for workplaceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for workplaceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

