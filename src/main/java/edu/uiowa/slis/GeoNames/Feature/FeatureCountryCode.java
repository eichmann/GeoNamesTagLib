package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureCountryCode extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureCountryCode currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureCountryCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureCountryCodeIterator theFeature = (FeatureCountryCodeIterator)findAncestorWithClass(this, FeatureCountryCodeIterator.class);
			pageContext.getOut().print(theFeature.getCountryCode());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for countryCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for countryCode tag ");
		}
		return SKIP_BODY;
	}
}

