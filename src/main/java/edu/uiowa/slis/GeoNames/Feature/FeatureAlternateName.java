package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureAlternateName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureAlternateName currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureAlternateName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureAlternateNameIterator theFeature = (FeatureAlternateNameIterator)findAncestorWithClass(this, FeatureAlternateNameIterator.class);
			pageContext.getOut().print(theFeature.getAlternateName());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for alternateName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for alternateName tag ");
		}
		return SKIP_BODY;
	}
}

