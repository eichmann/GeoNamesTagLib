package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageTipjarInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageTipjarInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageTipjarInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageTipjarInverseIterator theImageTipjarInverseIterator = (ImageTipjarInverseIterator)findAncestorWithClass(this, ImageTipjarInverseIterator.class);
			pageContext.getOut().print(theImageTipjarInverseIterator.getTipjarInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for tipjar tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for tipjar tag ");
		}
		return SKIP_BODY;
	}
}

