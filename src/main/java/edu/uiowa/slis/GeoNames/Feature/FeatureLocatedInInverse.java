package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureLocatedInInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureLocatedInInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureLocatedInInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureLocatedInInverseIterator theFeatureLocatedInInverseIterator = (FeatureLocatedInInverseIterator)findAncestorWithClass(this, FeatureLocatedInInverseIterator.class);
			pageContext.getOut().print(theFeatureLocatedInInverseIterator.getLocatedInInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for locatedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for locatedIn tag ");
		}
		return SKIP_BODY;
	}
}

