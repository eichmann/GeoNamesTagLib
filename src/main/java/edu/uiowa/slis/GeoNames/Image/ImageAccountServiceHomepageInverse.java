package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageAccountServiceHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageAccountServiceHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageAccountServiceHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageAccountServiceHomepageInverseIterator theImageAccountServiceHomepageInverseIterator = (ImageAccountServiceHomepageInverseIterator)findAncestorWithClass(this, ImageAccountServiceHomepageInverseIterator.class);
			pageContext.getOut().print(theImageAccountServiceHomepageInverseIterator.getAccountServiceHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for accountServiceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for accountServiceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

