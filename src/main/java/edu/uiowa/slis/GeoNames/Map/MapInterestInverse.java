package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapInterestInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapInterestInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MapInterestInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapInterestInverseIterator theMapInterestInverseIterator = (MapInterestInverseIterator)findAncestorWithClass(this, MapInterestInverseIterator.class);
			pageContext.getOut().print(theMapInterestInverseIterator.getInterestInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for interest tag ");
		}
		return SKIP_BODY;
	}
}

