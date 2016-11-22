package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureName currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureNameIterator theGeonamesFeature = (GeonamesFeatureNameIterator)findAncestorWithClass(this, GeonamesFeatureNameIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for name tag ");
		}
		return SKIP_BODY;
	}
}

