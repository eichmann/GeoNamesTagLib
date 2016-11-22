package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentWorkInfoHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentWorkInfoHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentWorkInfoHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentWorkInfoHomepageInverseIterator theDocumentWorkInfoHomepageInverseIterator = (DocumentWorkInfoHomepageInverseIterator)findAncestorWithClass(this, DocumentWorkInfoHomepageInverseIterator.class);
			pageContext.getOut().print(theDocumentWorkInfoHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for workInfoHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for workInfoHomepage tag ");
		}
		return SKIP_BODY;
	}
}

