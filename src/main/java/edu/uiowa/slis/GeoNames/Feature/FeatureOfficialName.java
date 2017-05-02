package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureOfficialName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureOfficialName currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureOfficialName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureOfficialNameIterator theFeature = (FeatureOfficialNameIterator)findAncestorWithClass(this, FeatureOfficialNameIterator.class);
			pageContext.getOut().print(theFeature.getOfficialName());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for officialName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for officialName tag ");
		}
		return SKIP_BODY;
	}
}

