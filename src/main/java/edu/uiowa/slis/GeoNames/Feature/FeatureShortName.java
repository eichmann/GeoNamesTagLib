package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureShortName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureShortName currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureShortName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureShortNameIterator theFeature = (FeatureShortNameIterator)findAncestorWithClass(this, FeatureShortNameIterator.class);
			pageContext.getOut().print(theFeature.getShortName());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for shortName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for shortName tag ");
		}
		return SKIP_BODY;
	}
}

