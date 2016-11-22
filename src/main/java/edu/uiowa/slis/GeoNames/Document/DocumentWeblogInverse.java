package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentWeblogInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentWeblogInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentWeblogInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentWeblogInverseIterator theDocumentWeblogInverseIterator = (DocumentWeblogInverseIterator)findAncestorWithClass(this, DocumentWeblogInverseIterator.class);
			pageContext.getOut().print(theDocumentWeblogInverseIterator.getWeblogInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for weblog tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for weblog tag ");
		}
		return SKIP_BODY;
	}
}

