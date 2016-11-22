package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapWorkplaceHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapWorkplaceHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MapWorkplaceHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapWorkplaceHomepageInverseIterator theMapWorkplaceHomepageInverseIterator = (MapWorkplaceHomepageInverseIterator)findAncestorWithClass(this, MapWorkplaceHomepageInverseIterator.class);
			pageContext.getOut().print(theMapWorkplaceHomepageInverseIterator.getWorkplaceHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for workplaceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for workplaceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

