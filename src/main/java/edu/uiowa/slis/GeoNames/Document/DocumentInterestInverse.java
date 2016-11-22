package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentInterestInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentInterestInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentInterestInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentInterestInverseIterator theDocumentInterestInverseIterator = (DocumentInterestInverseIterator)findAncestorWithClass(this, DocumentInterestInverseIterator.class);
			pageContext.getOut().print(theDocumentInterestInverseIterator.getInterestInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for interest tag ");
		}
		return SKIP_BODY;
	}
}

