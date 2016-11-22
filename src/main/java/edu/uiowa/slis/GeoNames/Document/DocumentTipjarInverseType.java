package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentTipjarInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentTipjarInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentTipjarInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentTipjarInverseIterator theDocumentTipjarInverseIterator = (DocumentTipjarInverseIterator)findAncestorWithClass(this, DocumentTipjarInverseIterator.class);
			pageContext.getOut().print(theDocumentTipjarInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for tipjar tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for tipjar tag ");
		}
		return SKIP_BODY;
	}
}

