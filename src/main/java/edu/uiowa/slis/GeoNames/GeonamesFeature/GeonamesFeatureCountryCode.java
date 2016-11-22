package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureCountryCode extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureCountryCode currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureCountryCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureCountryCodeIterator theGeonamesFeature = (GeonamesFeatureCountryCodeIterator)findAncestorWithClass(this, GeonamesFeatureCountryCodeIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getCountryCode());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for countryCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for countryCode tag ");
		}
		return SKIP_BODY;
	}
}

