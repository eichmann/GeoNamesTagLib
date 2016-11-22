package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentSha1 extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentSha1 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentSha1.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocumentSha1Iterator thePersonalProfileDocument = (PersonalProfileDocumentSha1Iterator)findAncestorWithClass(this, PersonalProfileDocumentSha1Iterator.class);
			pageContext.getOut().print(thePersonalProfileDocument.getSha1());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for sha1 tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for sha1 tag ");
		}
		return SKIP_BODY;
	}
}

