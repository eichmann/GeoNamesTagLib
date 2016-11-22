package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentAccountServiceHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentAccountServiceHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentAccountServiceHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocumentAccountServiceHomepageInverseIterator thePersonalProfileDocumentAccountServiceHomepageInverseIterator = (PersonalProfileDocumentAccountServiceHomepageInverseIterator)findAncestorWithClass(this, PersonalProfileDocumentAccountServiceHomepageInverseIterator.class);
			pageContext.getOut().print(thePersonalProfileDocumentAccountServiceHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for accountServiceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for accountServiceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

