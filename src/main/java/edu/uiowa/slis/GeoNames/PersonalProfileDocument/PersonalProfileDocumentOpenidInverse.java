package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentOpenidInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentOpenidInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentOpenidInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocumentOpenidInverseIterator thePersonalProfileDocumentOpenidInverseIterator = (PersonalProfileDocumentOpenidInverseIterator)findAncestorWithClass(this, PersonalProfileDocumentOpenidInverseIterator.class);
			pageContext.getOut().print(thePersonalProfileDocumentOpenidInverseIterator.getOpenidInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for openid tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for openid tag ");
		}
		return SKIP_BODY;
	}
}

