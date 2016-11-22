package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeaturePopulation extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeaturePopulation currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeaturePopulation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeaturePopulationIterator theGeonamesFeature = (GeonamesFeaturePopulationIterator)findAncestorWithClass(this, GeonamesFeaturePopulationIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getPopulation());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for population tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for population tag ");
		}
		return SKIP_BODY;
	}
}

