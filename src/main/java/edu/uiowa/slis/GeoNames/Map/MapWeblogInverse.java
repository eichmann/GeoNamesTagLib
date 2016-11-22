package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapWeblogInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapWeblogInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(MapWeblogInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MapWeblogInverseIterator theMapWeblogInverseIterator = (MapWeblogInverseIterator)findAncestorWithClass(this, MapWeblogInverseIterator.class);
			pageContext.getOut().print(theMapWeblogInverseIterator.getWeblogInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for weblog tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for weblog tag ");
		}
		return SKIP_BODY;
	}
}

