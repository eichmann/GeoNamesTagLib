package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataHomepageInverseIterator theRDFDataHomepageInverseIterator = (RDFDataHomepageInverseIterator)findAncestorWithClass(this, RDFDataHomepageInverseIterator.class);
			pageContext.getOut().print(theRDFDataHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for homepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for homepage tag ");
		}
		return SKIP_BODY;
	}
}

