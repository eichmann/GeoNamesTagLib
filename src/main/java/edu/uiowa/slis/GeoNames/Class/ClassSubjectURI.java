package edu.uiowa.slis.GeoNames.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ClassSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Class theClass = (Class)findAncestorWithClass(this, Class.class);
			if (!theClass.commitNeeded) {
				pageContext.getOut().print(theClass.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Class for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Class theClass = (Class)findAncestorWithClass(this, Class.class);
			return theClass.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Class for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Class theClass = (Class)findAncestorWithClass(this, Class.class);
			theClass.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Class for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for subjectURI tag ");
		}
	}
}

