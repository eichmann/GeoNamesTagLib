package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataNeighbouringFeaturesInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataNeighbouringFeaturesInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataNeighbouringFeaturesInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataNeighbouringFeaturesInverseIterator theRDFDataNeighbouringFeaturesInverseIterator = (RDFDataNeighbouringFeaturesInverseIterator)findAncestorWithClass(this, RDFDataNeighbouringFeaturesInverseIterator.class);
			pageContext.getOut().print(theRDFDataNeighbouringFeaturesInverseIterator.getNeighbouringFeaturesInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for neighbouringFeatures tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for neighbouringFeatures tag ");
		}
		return SKIP_BODY;
	}
}

