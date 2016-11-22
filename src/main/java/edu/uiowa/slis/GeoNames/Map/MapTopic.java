package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapTopic extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapTopic currentInstance = null;
	private static final Log log = LogFactory.getLog(MapTopic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			MapTopicIterator theMap = (MapTopicIterator)findAncestorWithClass(this, MapTopicIterator.class);
			pageContext.getOut().print(theMap.getTopic());
		} catch (Exception e) {
			log.error("Can't find enclosing Map for topic tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for topic tag ");
		}
		return SKIP_BODY;
	}
}

