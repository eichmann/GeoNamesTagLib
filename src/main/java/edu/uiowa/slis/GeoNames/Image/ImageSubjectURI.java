package edu.uiowa.slis.GeoNames.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ImageSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Image theImage = (Image)findAncestorWithClass(this, Image.class);
			if (!theImage.commitNeeded) {
				pageContext.getOut().print(theImage.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Image for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Image theImage = (Image)findAncestorWithClass(this, Image.class);
			return theImage.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Image for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Image theImage = (Image)findAncestorWithClass(this, Image.class);
			theImage.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Image for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for subjectURI tag ");
		}
	}
}

