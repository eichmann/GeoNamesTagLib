package edu.uiowa.slis.GeoNames.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ConceptSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Concept theConcept = (Concept)findAncestorWithClass(this, Concept.class);
			if (!theConcept.commitNeeded) {
				pageContext.getOut().print(theConcept.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Concept theConcept = (Concept)findAncestorWithClass(this, Concept.class);
			return theConcept.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Concept for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Concept theConcept = (Concept)findAncestorWithClass(this, Concept.class);
			theConcept.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for subjectURI tag ");
		}
	}
}

