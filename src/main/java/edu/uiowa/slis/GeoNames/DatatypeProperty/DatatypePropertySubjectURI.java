package edu.uiowa.slis.GeoNames.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertySubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DatatypePropertySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			DatatypeProperty theDatatypeProperty = (DatatypeProperty)findAncestorWithClass(this, DatatypeProperty.class);
			if (!theDatatypeProperty.commitNeeded) {
				pageContext.getOut().print(theDatatypeProperty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			DatatypeProperty theDatatypeProperty = (DatatypeProperty)findAncestorWithClass(this, DatatypeProperty.class);
			return theDatatypeProperty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing DatatypeProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			DatatypeProperty theDatatypeProperty = (DatatypeProperty)findAncestorWithClass(this, DatatypeProperty.class);
			theDatatypeProperty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for subjectURI tag ");
		}
	}
}

