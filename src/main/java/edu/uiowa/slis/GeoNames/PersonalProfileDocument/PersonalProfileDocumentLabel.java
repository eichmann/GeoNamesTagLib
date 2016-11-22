package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocument thePersonalProfileDocument = (PersonalProfileDocument)findAncestorWithClass(this, PersonalProfileDocument.class);
			if (!thePersonalProfileDocument.commitNeeded) {
				pageContext.getOut().print(thePersonalProfileDocument.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			PersonalProfileDocument thePersonalProfileDocument = (PersonalProfileDocument)findAncestorWithClass(this, PersonalProfileDocument.class);
			return thePersonalProfileDocument.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing PersonalProfileDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			PersonalProfileDocument thePersonalProfileDocument = (PersonalProfileDocument)findAncestorWithClass(this, PersonalProfileDocument.class);
			thePersonalProfileDocument.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for label tag ");
		}
	}
}

