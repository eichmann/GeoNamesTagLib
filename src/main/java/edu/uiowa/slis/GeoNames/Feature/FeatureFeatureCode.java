package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureFeatureCode extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureFeatureCode currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureFeatureCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureFeatureCodeIterator theFeature = (FeatureFeatureCodeIterator)findAncestorWithClass(this, FeatureFeatureCodeIterator.class);
			pageContext.getOut().print(theFeature.getFeatureCode());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for featureCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for featureCode tag ");
		}
		return SKIP_BODY;
	}
}

