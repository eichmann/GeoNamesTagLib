package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureLocationMap extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureLocationMap currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureLocationMap.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureLocationMapIterator theFeatureLocationMapIterator = (FeatureLocationMapIterator)findAncestorWithClass(this, FeatureLocationMapIterator.class);
			pageContext.getOut().print(theFeatureLocationMapIterator.getLocationMap());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for locationMap tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for locationMap tag ");
		}
		return SKIP_BODY;
	}
}

