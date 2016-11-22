package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeaturePostalCode extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeaturePostalCode currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeaturePostalCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeaturePostalCodeIterator theGeonamesFeature = (GeonamesFeaturePostalCodeIterator)findAncestorWithClass(this, GeonamesFeaturePostalCodeIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getPostalCode());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for postalCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for postalCode tag ");
		}
		return SKIP_BODY;
	}
}

