package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentPublicationsInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentPublicationsInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentPublicationsInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentPublicationsInverseIterator theDocumentPublicationsInverseIterator = (DocumentPublicationsInverseIterator)findAncestorWithClass(this, DocumentPublicationsInverseIterator.class);
			pageContext.getOut().print(theDocumentPublicationsInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for publications tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for publications tag ");
		}
		return SKIP_BODY;
	}
}

