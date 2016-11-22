package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureFeatureCode extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureFeatureCode currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureFeatureCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureFeatureCodeIterator theGeonamesFeature = (GeonamesFeatureFeatureCodeIterator)findAncestorWithClass(this, GeonamesFeatureFeatureCodeIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getFeatureCode());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for featureCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for featureCode tag ");
		}
		return SKIP_BODY;
	}
}

