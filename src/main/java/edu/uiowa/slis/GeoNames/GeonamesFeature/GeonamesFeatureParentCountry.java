package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureParentCountry extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureParentCountry currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureParentCountry.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureParentCountryIterator theGeonamesFeature = (GeonamesFeatureParentCountryIterator)findAncestorWithClass(this, GeonamesFeatureParentCountryIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getParentCountry());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for parentCountry tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for parentCountry tag ");
		}
		return SKIP_BODY;
	}
}

