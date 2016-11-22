package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentInterestInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentInterestInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentInterestInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocumentInterestInverseIterator thePersonalProfileDocumentInterestInverseIterator = (PersonalProfileDocumentInterestInverseIterator)findAncestorWithClass(this, PersonalProfileDocumentInterestInverseIterator.class);
			pageContext.getOut().print(thePersonalProfileDocumentInterestInverseIterator.getInterestInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for interest tag ");
		}
		return SKIP_BODY;
	}
}

