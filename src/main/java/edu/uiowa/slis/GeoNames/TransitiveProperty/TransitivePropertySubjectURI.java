package edu.uiowa.slis.GeoNames.TransitiveProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TransitivePropertySubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static TransitivePropertySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TransitivePropertySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TransitiveProperty theTransitiveProperty = (TransitiveProperty)findAncestorWithClass(this, TransitiveProperty.class);
			if (!theTransitiveProperty.commitNeeded) {
				pageContext.getOut().print(theTransitiveProperty.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TransitiveProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransitiveProperty for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			TransitiveProperty theTransitiveProperty = (TransitiveProperty)findAncestorWithClass(this, TransitiveProperty.class);
			return theTransitiveProperty.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing TransitiveProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransitiveProperty for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			TransitiveProperty theTransitiveProperty = (TransitiveProperty)findAncestorWithClass(this, TransitiveProperty.class);
			theTransitiveProperty.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing TransitiveProperty for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransitiveProperty for subjectURI tag ");
		}
	}
}

