package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Image theImage = (Image)findAncestorWithClass(this, Image.class);
			if (!theImage.commitNeeded) {
				pageContext.getOut().print(theImage.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Image for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Image theImage = (Image)findAncestorWithClass(this, Image.class);
			return theImage.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Image for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Image theImage = (Image)findAncestorWithClass(this, Image.class);
			theImage.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Image for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for label tag ");
		}
	}
}

