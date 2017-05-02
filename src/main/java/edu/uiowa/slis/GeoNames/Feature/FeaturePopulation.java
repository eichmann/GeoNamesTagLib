package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeaturePopulation extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeaturePopulation currentInstance = null;
	private static final Log log = LogFactory.getLog(FeaturePopulation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeaturePopulationIterator theFeature = (FeaturePopulationIterator)findAncestorWithClass(this, FeaturePopulationIterator.class);
			pageContext.getOut().print(theFeature.getPopulation());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for population tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for population tag ");
		}
		return SKIP_BODY;
	}
}

