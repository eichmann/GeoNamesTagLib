package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentAccountServiceHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentAccountServiceHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentAccountServiceHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			DocumentAccountServiceHomepageInverseIterator theDocumentAccountServiceHomepageInverseIterator = (DocumentAccountServiceHomepageInverseIterator)findAncestorWithClass(this, DocumentAccountServiceHomepageInverseIterator.class);
			pageContext.getOut().print(theDocumentAccountServiceHomepageInverseIterator.getAccountServiceHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Document for accountServiceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for accountServiceHomepage tag ");
		}
		return SKIP_BODY;
	}
}
