package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentWorkplaceHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentWorkplaceHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentWorkplaceHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentWorkplaceHomepageInverseIterator theDocumentWorkplaceHomepageInverseIterator = (DocumentWorkplaceHomepageInverseIterator)findAncestorWithClass(this, DocumentWorkplaceHomepageInverseIterator.class);
			pageContext.getOut().print(theDocumentWorkplaceHomepageInverseIterator.getWorkplaceHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for workplaceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for workplaceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

