package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentPrimaryTopic extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentPrimaryTopic currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentPrimaryTopic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocumentPrimaryTopicIterator thePersonalProfileDocument = (PersonalProfileDocumentPrimaryTopicIterator)findAncestorWithClass(this, PersonalProfileDocumentPrimaryTopicIterator.class);
			pageContext.getOut().print(thePersonalProfileDocument.getPrimaryTopic());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for primaryTopic tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for primaryTopic tag ");
		}
		return SKIP_BODY;
	}
}

