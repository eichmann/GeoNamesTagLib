package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentSchoolHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentSchoolHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentSchoolHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentSchoolHomepageInverseIterator theDocumentSchoolHomepageInverseIterator = (DocumentSchoolHomepageInverseIterator)findAncestorWithClass(this, DocumentSchoolHomepageInverseIterator.class);
			pageContext.getOut().print(theDocumentSchoolHomepageInverseIterator.getSchoolHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for schoolHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for schoolHomepage tag ");
		}
		return SKIP_BODY;
	}
}

