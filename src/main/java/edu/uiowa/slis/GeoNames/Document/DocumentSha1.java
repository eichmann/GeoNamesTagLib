package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentSha1 extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentSha1 currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentSha1.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DocumentSha1Iterator theDocument = (DocumentSha1Iterator)findAncestorWithClass(this, DocumentSha1Iterator.class);
			pageContext.getOut().print(theDocument.getSha1());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for sha1 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for sha1 tag ");
		}
		return SKIP_BODY;
	}
}

