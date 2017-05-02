package edu.uiowa.slis.GeoNames.Ontology;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OntologyLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OntologyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OntologyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Ontology theOntology = (Ontology)findAncestorWithClass(this, Ontology.class);
			if (!theOntology.commitNeeded) {
				pageContext.getOut().print(theOntology.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Ontology for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ontology for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Ontology theOntology = (Ontology)findAncestorWithClass(this, Ontology.class);
			return theOntology.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Ontology for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ontology for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Ontology theOntology = (Ontology)findAncestorWithClass(this, Ontology.class);
			theOntology.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Ontology for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ontology for label tag ");
		}
	}
}

