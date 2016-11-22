package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureParentADM3 extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureParentADM3 currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureParentADM3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureParentADM3Iterator theFeature = (FeatureParentADM3Iterator)findAncestorWithClass(this, FeatureParentADM3Iterator.class);
			pageContext.getOut().print(theFeature.getParentADM3());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for parentADM3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for parentADM3 tag ");
		}
		return SKIP_BODY;
	}
}

