package edu.uiowa.slis.GeoNames.ObjectProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ObjectPropertySubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ObjectPropertySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ObjectPropertySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ObjectProperty theObjectProperty = (ObjectProperty)findAncestorWithClass(this, ObjectProperty.class);
			if (!theObjectProperty.commitNeeded) {
				pageContext.getOut().print(theObjectProperty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ObjectProperty theObjectProperty = (ObjectProperty)findAncestorWithClass(this, ObjectProperty.class);
			return theObjectProperty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ObjectProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ObjectProperty theObjectProperty = (ObjectProperty)findAncestorWithClass(this, ObjectProperty.class);
			theObjectProperty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ObjectProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ObjectProperty for subjectURI tag ");
		}
	}
}

