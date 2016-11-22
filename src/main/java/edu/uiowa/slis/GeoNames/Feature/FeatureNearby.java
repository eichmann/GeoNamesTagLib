package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureNearby extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureNearby currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureNearby.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureNearbyIterator theFeature = (FeatureNearbyIterator)findAncestorWithClass(this, FeatureNearbyIterator.class);
			pageContext.getOut().print(theFeature.getNearby());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for nearby tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for nearby tag ");
		}
		return SKIP_BODY;
	}
}

