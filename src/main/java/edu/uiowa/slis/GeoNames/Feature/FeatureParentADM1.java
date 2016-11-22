package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureParentADM1 extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureParentADM1 currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureParentADM1.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureParentADM1Iterator theFeature = (FeatureParentADM1Iterator)findAncestorWithClass(this, FeatureParentADM1Iterator.class);
			pageContext.getOut().print(theFeature.getParentADM1());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for parentADM1 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for parentADM1 tag ");
		}
		return SKIP_BODY;
	}
}

