package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureParentADM4 extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureParentADM4 currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureParentADM4.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureParentADM4Iterator theGeonamesFeature = (GeonamesFeatureParentADM4Iterator)findAncestorWithClass(this, GeonamesFeatureParentADM4Iterator.class);
			pageContext.getOut().print(theGeonamesFeature.getParentADM4());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for parentADM4 tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for parentADM4 tag ");
		}
		return SKIP_BODY;
	}
}

