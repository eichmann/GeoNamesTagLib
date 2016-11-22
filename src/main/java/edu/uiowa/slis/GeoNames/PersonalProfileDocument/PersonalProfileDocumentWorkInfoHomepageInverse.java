package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentWorkInfoHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentWorkInfoHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentWorkInfoHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocumentWorkInfoHomepageInverseIterator thePersonalProfileDocumentWorkInfoHomepageInverseIterator = (PersonalProfileDocumentWorkInfoHomepageInverseIterator)findAncestorWithClass(this, PersonalProfileDocumentWorkInfoHomepageInverseIterator.class);
			pageContext.getOut().print(thePersonalProfileDocumentWorkInfoHomepageInverseIterator.getWorkInfoHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for workInfoHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for workInfoHomepage tag ");
		}
		return SKIP_BODY;
	}
}

