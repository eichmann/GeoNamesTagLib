package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentOpenidInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentOpenidInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentOpenidInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentOpenidInverseIterator theDocumentOpenidInverseIterator = (DocumentOpenidInverseIterator)findAncestorWithClass(this, DocumentOpenidInverseIterator.class);
			pageContext.getOut().print(theDocumentOpenidInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for openid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for openid tag ");
		}
		return SKIP_BODY;
	}
}

