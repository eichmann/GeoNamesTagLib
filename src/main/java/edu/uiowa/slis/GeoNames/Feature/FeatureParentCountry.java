package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureParentCountry extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureParentCountry currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureParentCountry.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureParentCountryIterator theFeature = (FeatureParentCountryIterator)findAncestorWithClass(this, FeatureParentCountryIterator.class);
			pageContext.getOut().print(theFeature.getParentCountry());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for parentCountry tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for parentCountry tag ");
		}
		return SKIP_BODY;
	}
}

