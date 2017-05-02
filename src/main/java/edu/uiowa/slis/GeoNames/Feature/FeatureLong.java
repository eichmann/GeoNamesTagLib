package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureLong extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureLong currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureLong.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureLongIterator theFeature = (FeatureLongIterator)findAncestorWithClass(this, FeatureLongIterator.class);
			pageContext.getOut().print(theFeature.getLong());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for long tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for long tag ");
		}
		return SKIP_BODY;
	}
}

