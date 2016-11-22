package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureNeighbour extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureNeighbour currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureNeighbour.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FeatureNeighbourIterator theFeature = (FeatureNeighbourIterator)findAncestorWithClass(this, FeatureNeighbourIterator.class);
			pageContext.getOut().print(theFeature.getNeighbour());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for neighbour tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for neighbour tag ");
		}
		return SKIP_BODY;
	}
}

