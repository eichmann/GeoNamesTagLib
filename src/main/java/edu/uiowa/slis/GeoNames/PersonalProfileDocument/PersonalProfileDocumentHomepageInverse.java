package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocumentHomepageInverseIterator thePersonalProfileDocumentHomepageInverseIterator = (PersonalProfileDocumentHomepageInverseIterator)findAncestorWithClass(this, PersonalProfileDocumentHomepageInverseIterator.class);
			pageContext.getOut().print(thePersonalProfileDocumentHomepageInverseIterator.getHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for homepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for homepage tag ");
		}
		return SKIP_BODY;
	}
}

