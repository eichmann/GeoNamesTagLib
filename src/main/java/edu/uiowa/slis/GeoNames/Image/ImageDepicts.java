package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageDepicts extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageDepicts currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageDepicts.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageDepictsIterator theImage = (ImageDepictsIterator)findAncestorWithClass(this, ImageDepictsIterator.class);
			pageContext.getOut().print(theImage.getDepicts());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for depicts tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for depicts tag ");
		}
		return SKIP_BODY;
	}
}

