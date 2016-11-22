package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureParentADM2 extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureParentADM2 currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureParentADM2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureParentADM2Iterator theFeature = (FeatureParentADM2Iterator)findAncestorWithClass(this, FeatureParentADM2Iterator.class);
			pageContext.getOut().print(theFeature.getParentADM2());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for parentADM2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for parentADM2 tag ");
		}
		return SKIP_BODY;
	}
}

