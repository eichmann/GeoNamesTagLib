package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureParentCountryType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureParentCountryType currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureParentCountryType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureParentCountryIterator theFeatureParentCountryIterator = (FeatureParentCountryIterator)findAncestorWithClass(this, FeatureParentCountryIterator.class);
			pageContext.getOut().print(theFeatureParentCountryIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for parentCountry tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for parentCountry tag ");
		}
		return SKIP_BODY;
	}
}

