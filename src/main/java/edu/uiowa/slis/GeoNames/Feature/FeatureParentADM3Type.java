package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureParentADM3Type extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureParentADM3Type currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureParentADM3Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureParentADM3Iterator theFeatureParentADM3Iterator = (FeatureParentADM3Iterator)findAncestorWithClass(this, FeatureParentADM3Iterator.class);
			pageContext.getOut().print(theFeatureParentADM3Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for parentADM3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for parentADM3 tag ");
		}
		return SKIP_BODY;
	}
}

