package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImagePublicationsInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImagePublicationsInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImagePublicationsInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImagePublicationsInverseIterator theImagePublicationsInverseIterator = (ImagePublicationsInverseIterator)findAncestorWithClass(this, ImagePublicationsInverseIterator.class);
			pageContext.getOut().print(theImagePublicationsInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for publications tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for publications tag ");
		}
		return SKIP_BODY;
	}
}

