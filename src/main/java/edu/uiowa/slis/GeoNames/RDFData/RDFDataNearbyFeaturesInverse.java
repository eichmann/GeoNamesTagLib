package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataNearbyFeaturesInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataNearbyFeaturesInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataNearbyFeaturesInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataNearbyFeaturesInverseIterator theRDFDataNearbyFeaturesInverseIterator = (RDFDataNearbyFeaturesInverseIterator)findAncestorWithClass(this, RDFDataNearbyFeaturesInverseIterator.class);
			pageContext.getOut().print(theRDFDataNearbyFeaturesInverseIterator.getNearbyFeaturesInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for nearbyFeatures tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for nearbyFeatures tag ");
		}
		return SKIP_BODY;
	}
}

