package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapLocationMapInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapLocationMapInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MapLocationMapInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapLocationMapInverseIterator theMapLocationMapInverseIterator = (MapLocationMapInverseIterator)findAncestorWithClass(this, MapLocationMapInverseIterator.class);
			pageContext.getOut().print(theMapLocationMapInverseIterator.getLocationMapInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for locationMap tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for locationMap tag ");
		}
		return SKIP_BODY;
	}
}

