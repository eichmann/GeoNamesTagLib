package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureParentADM2 extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureParentADM2 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureParentADM2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureParentADM2Iterator theGeonamesFeature = (GeonamesFeatureParentADM2Iterator)findAncestorWithClass(this, GeonamesFeatureParentADM2Iterator.class);
			pageContext.getOut().print(theGeonamesFeature.getParentADM2());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for parentADM2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for parentADM2 tag ");
		}
		return SKIP_BODY;
	}
}

