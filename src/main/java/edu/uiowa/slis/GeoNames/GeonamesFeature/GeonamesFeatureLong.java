package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureLong extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureLong currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureLong.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureLongIterator theGeonamesFeature = (GeonamesFeatureLongIterator)findAncestorWithClass(this, GeonamesFeatureLongIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getLong());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for long tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for long tag ");
		}
		return SKIP_BODY;
	}
}

