package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureBased_near extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureBased_near currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureBased_near.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureBased_nearIterator theFeature = (FeatureBased_nearIterator)findAncestorWithClass(this, FeatureBased_nearIterator.class);
			pageContext.getOut().print(theFeature.getBased_near());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for based_near tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for based_near tag ");
		}
		return SKIP_BODY;
	}
}

