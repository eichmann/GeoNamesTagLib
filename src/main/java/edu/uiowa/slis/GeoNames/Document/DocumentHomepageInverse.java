package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentHomepageInverseIterator theDocumentHomepageInverseIterator = (DocumentHomepageInverseIterator)findAncestorWithClass(this, DocumentHomepageInverseIterator.class);
			pageContext.getOut().print(theDocumentHomepageInverseIterator.getHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for homepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for homepage tag ");
		}
		return SKIP_BODY;
	}
}

