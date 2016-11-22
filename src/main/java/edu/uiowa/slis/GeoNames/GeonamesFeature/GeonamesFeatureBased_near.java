package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureBased_near extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureBased_near currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureBased_near.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureBased_nearIterator theGeonamesFeature = (GeonamesFeatureBased_nearIterator)findAncestorWithClass(this, GeonamesFeatureBased_nearIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getBased_near());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for based_near tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for based_near tag ");
		}
		return SKIP_BODY;
	}
}

