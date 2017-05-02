package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureParentADM4Type extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureParentADM4Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureParentADM4Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureParentADM4Iterator theFeatureParentADM4Iterator = (FeatureParentADM4Iterator)findAncestorWithClass(this, FeatureParentADM4Iterator.class);
			pageContext.getOut().print(theFeatureParentADM4Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for parentADM4 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for parentADM4 tag ");
		}
		return SKIP_BODY;
	}
}

