package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			if (!theDocument.commitNeeded) {
				pageContext.getOut().print(theDocument.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Document for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			return theDocument.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Document for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			theDocument.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Document for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for subjectURI tag ");
		}
	}
}

