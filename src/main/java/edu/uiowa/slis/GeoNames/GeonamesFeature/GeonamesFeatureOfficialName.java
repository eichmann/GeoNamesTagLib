package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureOfficialName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureOfficialName currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureOfficialName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureOfficialNameIterator theGeonamesFeature = (GeonamesFeatureOfficialNameIterator)findAncestorWithClass(this, GeonamesFeatureOfficialNameIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getOfficialName());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for officialName tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for officialName tag ");
		}
		return SKIP_BODY;
	}
}

