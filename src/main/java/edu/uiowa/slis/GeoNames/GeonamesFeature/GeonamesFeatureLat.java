package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureLat extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureLat currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureLat.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureLatIterator theGeonamesFeature = (GeonamesFeatureLatIterator)findAncestorWithClass(this, GeonamesFeatureLatIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getLat());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for lat tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for lat tag ");
		}
		return SKIP_BODY;
	}
}

