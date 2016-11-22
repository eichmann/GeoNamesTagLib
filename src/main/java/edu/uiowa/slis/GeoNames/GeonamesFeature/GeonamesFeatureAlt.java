package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureAlt extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureAlt currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureAlt.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureAltIterator theGeonamesFeature = (GeonamesFeatureAltIterator)findAncestorWithClass(this, GeonamesFeatureAltIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getAlt());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for alt tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for alt tag ");
		}
		return SKIP_BODY;
	}
}

