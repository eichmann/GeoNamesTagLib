package edu.uiowa.slis.GeoNames.Ontology;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OntologySubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OntologySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OntologySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Ontology theOntology = (Ontology)findAncestorWithClass(this, Ontology.class);
			if (!theOntology.commitNeeded) {
				pageContext.getOut().print(theOntology.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Ontology for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ontology for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Ontology theOntology = (Ontology)findAncestorWithClass(this, Ontology.class);
			return theOntology.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Ontology for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ontology for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Ontology theOntology = (Ontology)findAncestorWithClass(this, Ontology.class);
			theOntology.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Ontology for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ontology for subjectURI tag ");
		}
	}
}

