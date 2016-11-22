package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPrimaryTopic extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentPrimaryTopic currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPrimaryTopic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentPrimaryTopicIterator theDocument = (DocumentPrimaryTopicIterator)findAncestorWithClass(this, DocumentPrimaryTopicIterator.class);
			pageContext.getOut().print(theDocument.getPrimaryTopic());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for primaryTopic tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for primaryTopic tag ");
		}
		return SKIP_BODY;
	}
}

