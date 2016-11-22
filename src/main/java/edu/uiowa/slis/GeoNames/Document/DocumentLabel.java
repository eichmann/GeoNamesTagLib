package edu.uiowa.slis.GeoNames.Document;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DocumentLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DocumentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DocumentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			if (!theDocument.commitNeeded) {
				pageContext.getOut().print(theDocument.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Document for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			return theDocument.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Document for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Document theDocument = (Document)findAncestorWithClass(this, Document.class);
			theDocument.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Document for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Document for label tag ");
		}
	}
}

