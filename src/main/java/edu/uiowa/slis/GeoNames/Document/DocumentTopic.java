package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentTopic extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentTopic currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentTopic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentTopicIterator theDocument = (DocumentTopicIterator)findAncestorWithClass(this, DocumentTopicIterator.class);
			pageContext.getOut().print(theDocument.getTopic());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for topic tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for topic tag ");
		}
		return SKIP_BODY;
	}
}

