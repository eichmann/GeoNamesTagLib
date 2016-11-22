package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentWeblogInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentWeblogInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentWeblogInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocumentWeblogInverseIterator thePersonalProfileDocumentWeblogInverseIterator = (PersonalProfileDocumentWeblogInverseIterator)findAncestorWithClass(this, PersonalProfileDocumentWeblogInverseIterator.class);
			pageContext.getOut().print(thePersonalProfileDocumentWeblogInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for weblog tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for weblog tag ");
		}
		return SKIP_BODY;
	}
}

