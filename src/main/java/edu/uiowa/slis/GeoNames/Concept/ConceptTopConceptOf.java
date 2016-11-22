package edu.uiowa.slis.GeoNames.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptTopConceptOf extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ConceptTopConceptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptTopConceptOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConceptTopConceptOfIterator theConcept = (ConceptTopConceptOfIterator)findAncestorWithClass(this, ConceptTopConceptOfIterator.class);
			pageContext.getOut().print(theConcept.getTopConceptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

