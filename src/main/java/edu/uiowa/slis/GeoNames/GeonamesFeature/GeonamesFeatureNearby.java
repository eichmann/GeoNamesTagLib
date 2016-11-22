package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureNearby extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureNearby currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureNearby.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureNearbyIterator theGeonamesFeature = (GeonamesFeatureNearbyIterator)findAncestorWithClass(this, GeonamesFeatureNearbyIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getNearby());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for nearby tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for nearby tag ");
		}
		return SKIP_BODY;
	}
}

