package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageWorkplaceHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageWorkplaceHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageWorkplaceHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageWorkplaceHomepageInverseIterator theImageWorkplaceHomepageInverseIterator = (ImageWorkplaceHomepageInverseIterator)findAncestorWithClass(this, ImageWorkplaceHomepageInverseIterator.class);
			pageContext.getOut().print(theImageWorkplaceHomepageInverseIterator.getWorkplaceHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for workplaceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for workplaceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

