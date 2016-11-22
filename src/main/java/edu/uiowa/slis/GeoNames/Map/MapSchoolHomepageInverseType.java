package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapSchoolHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapSchoolHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapSchoolHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapSchoolHomepageInverseIterator theMapSchoolHomepageInverseIterator = (MapSchoolHomepageInverseIterator)findAncestorWithClass(this, MapSchoolHomepageInverseIterator.class);
			pageContext.getOut().print(theMapSchoolHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for schoolHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for schoolHomepage tag ");
		}
		return SKIP_BODY;
	}
}

