package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureNearbyFeatures extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureNearbyFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureNearbyFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureNearbyFeaturesIterator theFeatureNearbyFeaturesIterator = (FeatureNearbyFeaturesIterator)findAncestorWithClass(this, FeatureNearbyFeaturesIterator.class);
			pageContext.getOut().print(theFeatureNearbyFeaturesIterator.getNearbyFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for nearbyFeatures tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for nearbyFeatures tag ");
		}
		return SKIP_BODY;
	}
}

