package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureAlt extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureAlt currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureAlt.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureAltIterator theFeature = (FeatureAltIterator)findAncestorWithClass(this, FeatureAltIterator.class);
			pageContext.getOut().print(theFeature.getAlt());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for alt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for alt tag ");
		}
		return SKIP_BODY;
	}
}

