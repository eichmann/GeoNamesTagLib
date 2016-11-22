package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapOpenidInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapOpenidInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MapOpenidInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapOpenidInverseIterator theMapOpenidInverseIterator = (MapOpenidInverseIterator)findAncestorWithClass(this, MapOpenidInverseIterator.class);
			pageContext.getOut().print(theMapOpenidInverseIterator.getOpenidInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for openid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for openid tag ");
		}
		return SKIP_BODY;
	}
}

