package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageWeblogInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageWeblogInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageWeblogInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageWeblogInverseIterator theImageWeblogInverseIterator = (ImageWeblogInverseIterator)findAncestorWithClass(this, ImageWeblogInverseIterator.class);
			pageContext.getOut().print(theImageWeblogInverseIterator.getWeblogInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for weblog tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for weblog tag ");
		}
		return SKIP_BODY;
	}
}

