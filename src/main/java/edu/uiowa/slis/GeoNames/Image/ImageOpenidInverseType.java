package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageOpenidInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageOpenidInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageOpenidInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageOpenidInverseIterator theImageOpenidInverseIterator = (ImageOpenidInverseIterator)findAncestorWithClass(this, ImageOpenidInverseIterator.class);
			pageContext.getOut().print(theImageOpenidInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for openid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for openid tag ");
		}
		return SKIP_BODY;
	}
}

