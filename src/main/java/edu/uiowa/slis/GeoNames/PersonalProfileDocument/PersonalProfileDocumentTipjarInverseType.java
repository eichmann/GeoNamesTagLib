package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentTipjarInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentTipjarInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentTipjarInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocumentTipjarInverseIterator thePersonalProfileDocumentTipjarInverseIterator = (PersonalProfileDocumentTipjarInverseIterator)findAncestorWithClass(this, PersonalProfileDocumentTipjarInverseIterator.class);
			pageContext.getOut().print(thePersonalProfileDocumentTipjarInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for tipjar tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for tipjar tag ");
		}
		return SKIP_BODY;
	}
}

