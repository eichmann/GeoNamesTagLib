package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImagePrimaryTopic extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImagePrimaryTopic currentInstance = null;
	private static final Log log = LogFactory.getLog(ImagePrimaryTopic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImagePrimaryTopicIterator theImage = (ImagePrimaryTopicIterator)findAncestorWithClass(this, ImagePrimaryTopicIterator.class);
			pageContext.getOut().print(theImage.getPrimaryTopic());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for primaryTopic tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for primaryTopic tag ");
		}
		return SKIP_BODY;
	}
}

