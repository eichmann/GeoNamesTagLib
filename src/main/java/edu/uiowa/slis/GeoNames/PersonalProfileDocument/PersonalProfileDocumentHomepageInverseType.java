package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocumentHomepageInverseIterator thePersonalProfileDocumentHomepageInverseIterator = (PersonalProfileDocumentHomepageInverseIterator)findAncestorWithClass(this, PersonalProfileDocumentHomepageInverseIterator.class);
			pageContext.getOut().print(thePersonalProfileDocumentHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for homepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for homepage tag ");
		}
		return SKIP_BODY;
	}
}

