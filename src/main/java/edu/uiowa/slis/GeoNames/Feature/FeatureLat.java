package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureLat extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureLat currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureLat.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureLatIterator theFeature = (FeatureLatIterator)findAncestorWithClass(this, FeatureLatIterator.class);
			pageContext.getOut().print(theFeature.getLat());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for lat tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for lat tag ");
		}
		return SKIP_BODY;
	}
}

