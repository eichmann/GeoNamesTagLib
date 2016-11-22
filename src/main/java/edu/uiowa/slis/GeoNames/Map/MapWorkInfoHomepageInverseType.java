package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapWorkInfoHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapWorkInfoHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapWorkInfoHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapWorkInfoHomepageInverseIterator theMapWorkInfoHomepageInverseIterator = (MapWorkInfoHomepageInverseIterator)findAncestorWithClass(this, MapWorkInfoHomepageInverseIterator.class);
			pageContext.getOut().print(theMapWorkInfoHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for workInfoHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for workInfoHomepage tag ");
		}
		return SKIP_BODY;
	}
}

