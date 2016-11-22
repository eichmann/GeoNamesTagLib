package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapSha1 extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapSha1 currentInstance = null;
	private static final Log log = LogFactory.getLog(MapSha1.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapSha1Iterator theMap = (MapSha1Iterator)findAncestorWithClass(this, MapSha1Iterator.class);
			pageContext.getOut().print(theMap.getSha1());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for sha1 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for sha1 tag ");
		}
		return SKIP_BODY;
	}
}

