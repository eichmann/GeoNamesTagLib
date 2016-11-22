package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureName currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureNameIterator theFeature = (FeatureNameIterator)findAncestorWithClass(this, FeatureNameIterator.class);
			pageContext.getOut().print(theFeature.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for name tag ");
		}
		return SKIP_BODY;
	}
}

