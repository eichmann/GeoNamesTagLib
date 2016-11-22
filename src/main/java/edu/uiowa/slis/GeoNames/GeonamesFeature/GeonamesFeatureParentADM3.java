package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureParentADM3 extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureParentADM3 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureParentADM3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureParentADM3Iterator theGeonamesFeature = (GeonamesFeatureParentADM3Iterator)findAncestorWithClass(this, GeonamesFeatureParentADM3Iterator.class);
			pageContext.getOut().print(theGeonamesFeature.getParentADM3());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for parentADM3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for parentADM3 tag ");
		}
		return SKIP_BODY;
	}
}

