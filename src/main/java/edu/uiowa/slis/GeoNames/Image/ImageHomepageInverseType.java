package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageHomepageInverseIterator theImageHomepageInverseIterator = (ImageHomepageInverseIterator)findAncestorWithClass(this, ImageHomepageInverseIterator.class);
			pageContext.getOut().print(theImageHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for homepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for homepage tag ");
		}
		return SKIP_BODY;
	}
}

