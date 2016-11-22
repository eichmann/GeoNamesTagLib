package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageTopic extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageTopic currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageTopic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageTopicIterator theImage = (ImageTopicIterator)findAncestorWithClass(this, ImageTopicIterator.class);
			pageContext.getOut().print(theImage.getTopic());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for topic tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for topic tag ");
		}
		return SKIP_BODY;
	}
}

