package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageSchoolHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageSchoolHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageSchoolHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageSchoolHomepageInverseIterator theImageSchoolHomepageInverseIterator = (ImageSchoolHomepageInverseIterator)findAncestorWithClass(this, ImageSchoolHomepageInverseIterator.class);
			pageContext.getOut().print(theImageSchoolHomepageInverseIterator.getSchoolHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for schoolHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for schoolHomepage tag ");
		}
		return SKIP_BODY;
	}
}

