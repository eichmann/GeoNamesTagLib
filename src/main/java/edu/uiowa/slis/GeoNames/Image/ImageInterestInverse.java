package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageInterestInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageInterestInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageInterestInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageInterestInverseIterator theImageInterestInverseIterator = (ImageInterestInverseIterator)findAncestorWithClass(this, ImageInterestInverseIterator.class);
			pageContext.getOut().print(theImageInterestInverseIterator.getInterestInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for interest tag ");
		}
		return SKIP_BODY;
	}
}

