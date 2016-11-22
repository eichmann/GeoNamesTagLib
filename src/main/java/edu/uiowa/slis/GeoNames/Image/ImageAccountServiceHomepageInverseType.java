package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageAccountServiceHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageAccountServiceHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageAccountServiceHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageAccountServiceHomepageInverseIterator theImageAccountServiceHomepageInverseIterator = (ImageAccountServiceHomepageInverseIterator)findAncestorWithClass(this, ImageAccountServiceHomepageInverseIterator.class);
			pageContext.getOut().print(theImageAccountServiceHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for accountServiceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for accountServiceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

