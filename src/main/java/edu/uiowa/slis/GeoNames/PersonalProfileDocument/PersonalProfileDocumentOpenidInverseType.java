package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentOpenidInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentOpenidInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentOpenidInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocumentOpenidInverseIterator thePersonalProfileDocumentOpenidInverseIterator = (PersonalProfileDocumentOpenidInverseIterator)findAncestorWithClass(this, PersonalProfileDocumentOpenidInverseIterator.class);
			pageContext.getOut().print(thePersonalProfileDocumentOpenidInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for openid tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for openid tag ");
		}
		return SKIP_BODY;
	}
}

