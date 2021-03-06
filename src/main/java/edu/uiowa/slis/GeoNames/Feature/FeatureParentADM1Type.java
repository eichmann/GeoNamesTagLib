package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureParentADM1Type extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureParentADM1Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureParentADM1Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureParentADM1Iterator theFeatureParentADM1Iterator = (FeatureParentADM1Iterator)findAncestorWithClass(this, FeatureParentADM1Iterator.class);
			pageContext.getOut().print(theFeatureParentADM1Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for parentADM1 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for parentADM1 tag ");
		}
		return SKIP_BODY;
	}
}

