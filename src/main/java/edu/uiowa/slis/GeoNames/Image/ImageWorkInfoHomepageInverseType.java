package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageWorkInfoHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageWorkInfoHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageWorkInfoHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageWorkInfoHomepageInverseIterator theImageWorkInfoHomepageInverseIterator = (ImageWorkInfoHomepageInverseIterator)findAncestorWithClass(this, ImageWorkInfoHomepageInverseIterator.class);
			pageContext.getOut().print(theImageWorkInfoHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for workInfoHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for workInfoHomepage tag ");
		}
		return SKIP_BODY;
	}
}

