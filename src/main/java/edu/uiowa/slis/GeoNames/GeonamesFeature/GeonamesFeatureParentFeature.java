package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureParentFeature extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureParentFeature currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureParentFeature.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureParentFeatureIterator theGeonamesFeature = (GeonamesFeatureParentFeatureIterator)findAncestorWithClass(this, GeonamesFeatureParentFeatureIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getParentFeature());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for parentFeature tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for parentFeature tag ");
		}
		return SKIP_BODY;
	}
}

