package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureNeighbour extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureNeighbour currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureNeighbour.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureNeighbourIterator theGeonamesFeature = (GeonamesFeatureNeighbourIterator)findAncestorWithClass(this, GeonamesFeatureNeighbourIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getNeighbour());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for neighbour tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for neighbour tag ");
		}
		return SKIP_BODY;
	}
}

