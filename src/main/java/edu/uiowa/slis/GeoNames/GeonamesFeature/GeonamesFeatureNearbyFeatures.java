package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureNearbyFeatures extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureNearbyFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureNearbyFeatures.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureNearbyFeaturesIterator theGeonamesFeature = (GeonamesFeatureNearbyFeaturesIterator)findAncestorWithClass(this, GeonamesFeatureNearbyFeaturesIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getNearbyFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for nearbyFeatures tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for nearbyFeatures tag ");
		}
		return SKIP_BODY;
	}
}

