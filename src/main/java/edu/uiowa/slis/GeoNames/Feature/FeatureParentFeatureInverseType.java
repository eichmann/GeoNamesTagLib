package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureParentFeatureInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureParentFeatureInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureParentFeatureInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureParentFeatureInverseIterator theFeatureParentFeatureInverseIterator = (FeatureParentFeatureInverseIterator)findAncestorWithClass(this, FeatureParentFeatureInverseIterator.class);
			pageContext.getOut().print(theFeatureParentFeatureInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for parentFeature tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for parentFeature tag ");
		}
		return SKIP_BODY;
	}
}

