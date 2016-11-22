package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureAlternateName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureAlternateName currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureAlternateName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureAlternateNameIterator theGeonamesFeature = (GeonamesFeatureAlternateNameIterator)findAncestorWithClass(this, GeonamesFeatureAlternateNameIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getAlternateName());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for alternateName tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for alternateName tag ");
		}
		return SKIP_BODY;
	}
}

