package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentPublicationsInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentPublicationsInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentPublicationsInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocumentPublicationsInverseIterator thePersonalProfileDocumentPublicationsInverseIterator = (PersonalProfileDocumentPublicationsInverseIterator)findAncestorWithClass(this, PersonalProfileDocumentPublicationsInverseIterator.class);
			pageContext.getOut().print(thePersonalProfileDocumentPublicationsInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for publications tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for publications tag ");
		}
		return SKIP_BODY;
	}
}

