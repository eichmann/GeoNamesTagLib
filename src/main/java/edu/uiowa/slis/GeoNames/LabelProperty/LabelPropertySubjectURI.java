package edu.uiowa.slis.GeoNames.LabelProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LabelPropertySubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static LabelPropertySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LabelPropertySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LabelProperty theLabelProperty = (LabelProperty)findAncestorWithClass(this, LabelProperty.class);
			if (!theLabelProperty.commitNeeded) {
				pageContext.getOut().print(theLabelProperty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LabelProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LabelProperty for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			LabelProperty theLabelProperty = (LabelProperty)findAncestorWithClass(this, LabelProperty.class);
			return theLabelProperty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing LabelProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LabelProperty for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			LabelProperty theLabelProperty = (LabelProperty)findAncestorWithClass(this, LabelProperty.class);
			theLabelProperty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing LabelProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LabelProperty for subjectURI tag ");
		}
	}
}

