package edu.uiowa.slis.GeoNames.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptRepresentationTechniqueInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ConceptRepresentationTechniqueInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptRepresentationTechniqueInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptRepresentationTechniqueInverseIterator theConceptRepresentationTechniqueInverseIterator = (ConceptRepresentationTechniqueInverseIterator)findAncestorWithClass(this, ConceptRepresentationTechniqueInverseIterator.class);
			pageContext.getOut().print(theConceptRepresentationTechniqueInverseIterator.getRepresentationTechniqueInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for representationTechnique tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for representationTechnique tag ");
		}
		return SKIP_BODY;
	}
}

