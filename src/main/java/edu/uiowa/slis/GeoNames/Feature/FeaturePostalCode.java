package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeaturePostalCode extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeaturePostalCode currentInstance = null;
	private static final Log log = LogFactory.getLog(FeaturePostalCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeaturePostalCodeIterator theFeature = (FeaturePostalCodeIterator)findAncestorWithClass(this, FeaturePostalCodeIterator.class);
			pageContext.getOut().print(theFeature.getPostalCode());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for postalCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for postalCode tag ");
		}
		return SKIP_BODY;
	}
}

