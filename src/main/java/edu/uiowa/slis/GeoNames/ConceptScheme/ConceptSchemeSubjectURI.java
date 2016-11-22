package edu.uiowa.slis.GeoNames.ConceptScheme;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptSchemeSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ConceptSchemeSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptSchemeSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConceptScheme theConceptScheme = (ConceptScheme)findAncestorWithClass(this, ConceptScheme.class);
			if (!theConceptScheme.commitNeeded) {
				pageContext.getOut().print(theConceptScheme.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConceptScheme for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConceptScheme for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ConceptScheme theConceptScheme = (ConceptScheme)findAncestorWithClass(this, ConceptScheme.class);
			return theConceptScheme.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConceptScheme for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConceptScheme for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ConceptScheme theConceptScheme = (ConceptScheme)findAncestorWithClass(this, ConceptScheme.class);
			theConceptScheme.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ConceptScheme for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConceptScheme for subjectURI tag ");
		}
	}
}

