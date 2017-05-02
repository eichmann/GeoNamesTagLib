package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureParentADM2Type extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureParentADM2Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureParentADM2Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureParentADM2Iterator theFeatureParentADM2Iterator = (FeatureParentADM2Iterator)findAncestorWithClass(this, FeatureParentADM2Iterator.class);
			pageContext.getOut().print(theFeatureParentADM2Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for parentADM2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for parentADM2 tag ");
		}
		return SKIP_BODY;
	}
}

