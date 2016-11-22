package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapOpenidInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapOpenidInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(MapOpenidInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapOpenidInverseIterator theMapOpenidInverseIterator = (MapOpenidInverseIterator)findAncestorWithClass(this, MapOpenidInverseIterator.class);
			pageContext.getOut().print(theMapOpenidInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for openid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for openid tag ");
		}
		return SKIP_BODY;
	}
}

