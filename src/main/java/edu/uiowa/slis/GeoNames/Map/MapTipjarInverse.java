package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapTipjarInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapTipjarInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MapTipjarInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapTipjarInverseIterator theMapTipjarInverseIterator = (MapTipjarInverseIterator)findAncestorWithClass(this, MapTipjarInverseIterator.class);
			pageContext.getOut().print(theMapTipjarInverseIterator.getTipjarInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for tipjar tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for tipjar tag ");
		}
		return SKIP_BODY;
	}
}

