package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapPrimaryTopic extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapPrimaryTopic currentInstance = null;
	private static final Log log = LogFactory.getLog(MapPrimaryTopic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapPrimaryTopicIterator theMap = (MapPrimaryTopicIterator)findAncestorWithClass(this, MapPrimaryTopicIterator.class);
			pageContext.getOut().print(theMap.getPrimaryTopic());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for primaryTopic tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for primaryTopic tag ");
		}
		return SKIP_BODY;
	}
}

