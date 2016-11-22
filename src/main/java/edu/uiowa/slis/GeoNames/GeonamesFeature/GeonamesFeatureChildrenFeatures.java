package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureChildrenFeatures extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureChildrenFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureChildrenFeatures.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureChildrenFeaturesIterator theGeonamesFeature = (GeonamesFeatureChildrenFeaturesIterator)findAncestorWithClass(this, GeonamesFeatureChildrenFeaturesIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getChildrenFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for childrenFeatures tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for childrenFeatures tag ");
		}
		return SKIP_BODY;
	}
}

