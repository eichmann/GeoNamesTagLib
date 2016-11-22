package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentSchoolHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentSchoolHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentSchoolHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocumentSchoolHomepageInverseIterator thePersonalProfileDocumentSchoolHomepageInverseIterator = (PersonalProfileDocumentSchoolHomepageInverseIterator)findAncestorWithClass(this, PersonalProfileDocumentSchoolHomepageInverseIterator.class);
			pageContext.getOut().print(thePersonalProfileDocumentSchoolHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for schoolHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for schoolHomepage tag ");
		}
		return SKIP_BODY;
	}
}

