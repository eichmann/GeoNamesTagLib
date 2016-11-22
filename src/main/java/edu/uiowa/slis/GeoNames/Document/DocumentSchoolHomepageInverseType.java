package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentSchoolHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentSchoolHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentSchoolHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentSchoolHomepageInverseIterator theDocumentSchoolHomepageInverseIterator = (DocumentSchoolHomepageInverseIterator)findAncestorWithClass(this, DocumentSchoolHomepageInverseIterator.class);
			pageContext.getOut().print(theDocumentSchoolHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for schoolHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for schoolHomepage tag ");
		}
		return SKIP_BODY;
	}
}

