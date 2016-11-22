package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MapHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapHomepageInverseIterator theMapHomepageInverseIterator = (MapHomepageInverseIterator)findAncestorWithClass(this, MapHomepageInverseIterator.class);
			pageContext.getOut().print(theMapHomepageInverseIterator.getHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for homepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for homepage tag ");
		}
		return SKIP_BODY;
	}
}

