package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureNeighbouringFeatures extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureNeighbouringFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureNeighbouringFeatures.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureNeighbouringFeaturesIterator theGeonamesFeature = (GeonamesFeatureNeighbouringFeaturesIterator)findAncestorWithClass(this, GeonamesFeatureNeighbouringFeaturesIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getNeighbouringFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for neighbouringFeatures tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for neighbouringFeatures tag ");
		}
		return SKIP_BODY;
	}
}

