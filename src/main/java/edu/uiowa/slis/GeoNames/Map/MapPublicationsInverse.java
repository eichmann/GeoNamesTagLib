package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapPublicationsInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapPublicationsInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MapPublicationsInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapPublicationsInverseIterator theMapPublicationsInverseIterator = (MapPublicationsInverseIterator)findAncestorWithClass(this, MapPublicationsInverseIterator.class);
			pageContext.getOut().print(theMapPublicationsInverseIterator.getPublicationsInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for publications tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for publications tag ");
		}
		return SKIP_BODY;
	}
}

