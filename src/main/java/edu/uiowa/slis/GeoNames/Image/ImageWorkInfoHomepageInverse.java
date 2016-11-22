package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageWorkInfoHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageWorkInfoHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageWorkInfoHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageWorkInfoHomepageInverseIterator theImageWorkInfoHomepageInverseIterator = (ImageWorkInfoHomepageInverseIterator)findAncestorWithClass(this, ImageWorkInfoHomepageInverseIterator.class);
			pageContext.getOut().print(theImageWorkInfoHomepageInverseIterator.getWorkInfoHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for workInfoHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for workInfoHomepage tag ");
		}
		return SKIP_BODY;
	}
}

