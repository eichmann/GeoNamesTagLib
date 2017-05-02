package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureChildrenFeatures extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureChildrenFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureChildrenFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureChildrenFeaturesIterator theFeatureChildrenFeaturesIterator = (FeatureChildrenFeaturesIterator)findAncestorWithClass(this, FeatureChildrenFeaturesIterator.class);
			pageContext.getOut().print(theFeatureChildrenFeaturesIterator.getChildrenFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for childrenFeatures tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for childrenFeatures tag ");
		}
		return SKIP_BODY;
	}
}

