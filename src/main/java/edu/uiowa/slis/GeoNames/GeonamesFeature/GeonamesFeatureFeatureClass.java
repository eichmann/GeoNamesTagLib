package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureFeatureClass extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureFeatureClass currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureFeatureClass.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureFeatureClassIterator theGeonamesFeature = (GeonamesFeatureFeatureClassIterator)findAncestorWithClass(this, GeonamesFeatureFeatureClassIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getFeatureClass());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for featureClass tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for featureClass tag ");
		}
		return SKIP_BODY;
	}
}
