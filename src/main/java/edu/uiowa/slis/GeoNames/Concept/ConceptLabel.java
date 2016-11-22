package edu.uiowa.slis.GeoNames.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ConceptLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Concept theConcept = (Concept)findAncestorWithClass(this, Concept.class);
			if (!theConcept.commitNeeded) {
				pageContext.getOut().print(theConcept.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Concept theConcept = (Concept)findAncestorWithClass(this, Concept.class);
			return theConcept.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Concept for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Concept theConcept = (Concept)findAncestorWithClass(this, Concept.class);
			theConcept.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for label tag ");
		}
	}
}

