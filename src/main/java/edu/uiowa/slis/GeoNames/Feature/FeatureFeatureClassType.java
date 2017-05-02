package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureFeatureClassType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureFeatureClassType currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureFeatureClassType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureFeatureClassIterator theFeatureFeatureClassIterator = (FeatureFeatureClassIterator)findAncestorWithClass(this, FeatureFeatureClassIterator.class);
			pageContext.getOut().print(theFeatureFeatureClassIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for featureClass tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for featureClass tag ");
		}
		return SKIP_BODY;
	}
}

