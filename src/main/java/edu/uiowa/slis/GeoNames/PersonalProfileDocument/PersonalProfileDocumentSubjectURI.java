package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocument thePersonalProfileDocument = (PersonalProfileDocument)findAncestorWithClass(this, PersonalProfileDocument.class);
			if (!thePersonalProfileDocument.commitNeeded) {
				pageContext.getOut().print(thePersonalProfileDocument.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PersonalProfileDocument thePersonalProfileDocument = (PersonalProfileDocument)findAncestorWithClass(this, PersonalProfileDocument.class);
			return thePersonalProfileDocument.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PersonalProfileDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PersonalProfileDocument thePersonalProfileDocument = (PersonalProfileDocument)findAncestorWithClass(this, PersonalProfileDocument.class);
			thePersonalProfileDocument.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for subjectURI tag ");
		}
	}
}

