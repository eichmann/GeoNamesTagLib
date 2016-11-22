package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureShortName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureShortName currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureShortName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureShortNameIterator theGeonamesFeature = (GeonamesFeatureShortNameIterator)findAncestorWithClass(this, GeonamesFeatureShortNameIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getShortName());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for shortName tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for shortName tag ");
		}
		return SKIP_BODY;
	}
}

