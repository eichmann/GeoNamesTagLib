package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureLocatedInInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureLocatedInInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureLocatedInInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureLocatedInInverseIterator theGeonamesFeatureLocatedInInverseIterator = (GeonamesFeatureLocatedInInverseIterator)findAncestorWithClass(this, GeonamesFeatureLocatedInInverseIterator.class);
			pageContext.getOut().print(theGeonamesFeatureLocatedInInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for locatedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for locatedIn tag ");
		}
		return SKIP_BODY;
	}
}

