package edu.uiowa.slis.GeoNames.PersonalProfileDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonalProfileDocumentTopic extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonalProfileDocumentTopic currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonalProfileDocumentTopic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonalProfileDocumentTopicIterator thePersonalProfileDocument = (PersonalProfileDocumentTopicIterator)findAncestorWithClass(this, PersonalProfileDocumentTopicIterator.class);
			pageContext.getOut().print(thePersonalProfileDocument.getTopic());
		} catch (Exception e) {
			log.error("Can't find enclosing PersonalProfileDocument for topic tag ", e);
			throw new JspTagException("Error: Can't find enclosing PersonalProfileDocument for topic tag ");
		}
		return SKIP_BODY;
	}
}

