package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureNeighbouringFeaturesType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureNeighbouringFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureNeighbouringFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureNeighbouringFeaturesIterator theFeatureNeighbouringFeaturesIterator = (FeatureNeighbouringFeaturesIterator)findAncestorWithClass(this, FeatureNeighbouringFeaturesIterator.class);
			pageContext.getOut().print(theFeatureNeighbouringFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for neighbouringFeatures tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for neighbouringFeatures tag ");
		}
		return SKIP_BODY;
	}
}

