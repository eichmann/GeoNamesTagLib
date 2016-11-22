package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureLocationMap extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureLocationMap currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureLocationMap.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureLocationMapIterator theGeonamesFeature = (GeonamesFeatureLocationMapIterator)findAncestorWithClass(this, GeonamesFeatureLocationMapIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getLocationMap());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for locationMap tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for locationMap tag ");
		}
		return SKIP_BODY;
	}
}

