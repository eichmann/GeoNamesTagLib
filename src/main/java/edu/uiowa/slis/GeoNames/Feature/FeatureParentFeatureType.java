package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureParentFeatureType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureParentFeatureType currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureParentFeatureType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureParentFeatureIterator theFeatureParentFeatureIterator = (FeatureParentFeatureIterator)findAncestorWithClass(this, FeatureParentFeatureIterator.class);
			pageContext.getOut().print(theFeatureParentFeatureIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for parentFeature tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for parentFeature tag ");
		}
		return SKIP_BODY;
	}
}

