package edu.uiowa.slis.GeoNames.SymmetricProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SymmetricPropertySubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static SymmetricPropertySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SymmetricPropertySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SymmetricProperty theSymmetricProperty = (SymmetricProperty)findAncestorWithClass(this, SymmetricProperty.class);
			if (!theSymmetricProperty.commitNeeded) {
				pageContext.getOut().print(theSymmetricProperty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SymmetricProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SymmetricProperty for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			SymmetricProperty theSymmetricProperty = (SymmetricProperty)findAncestorWithClass(this, SymmetricProperty.class);
			return theSymmetricProperty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing SymmetricProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SymmetricProperty for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			SymmetricProperty theSymmetricProperty = (SymmetricProperty)findAncestorWithClass(this, SymmetricProperty.class);
			theSymmetricProperty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing SymmetricProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SymmetricProperty for subjectURI tag ");
		}
	}
}

