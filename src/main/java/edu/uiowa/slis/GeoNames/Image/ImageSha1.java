package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageSha1 extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageSha1 currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageSha1.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageSha1Iterator theImage = (ImageSha1Iterator)findAncestorWithClass(this, ImageSha1Iterator.class);
			pageContext.getOut().print(theImage.getSha1());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for sha1 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for sha1 tag ");
		}
		return SKIP_BODY;
	}
}

