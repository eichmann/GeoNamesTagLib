package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageThumbnail extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageThumbnail currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageThumbnail.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageThumbnailIterator theImage = (ImageThumbnailIterator)findAncestorWithClass(this, ImageThumbnailIterator.class);
			pageContext.getOut().print(theImage.getThumbnail());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for thumbnail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for thumbnail tag ");
		}
		return SKIP_BODY;
	}
}

