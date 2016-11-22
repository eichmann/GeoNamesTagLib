package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureParentADM1 extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureParentADM1 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureParentADM1.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureParentADM1Iterator theGeonamesFeature = (GeonamesFeatureParentADM1Iterator)findAncestorWithClass(this, GeonamesFeatureParentADM1Iterator.class);
			pageContext.getOut().print(theGeonamesFeature.getParentADM1());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for parentADM1 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for parentADM1 tag ");
		}
		return SKIP_BODY;
	}
}

