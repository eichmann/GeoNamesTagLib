package edu.uiowa.slis.GeoNames.ConceptScheme;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptSchemeHasTopConcept extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ConceptSchemeHasTopConcept currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptSchemeHasTopConcept.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConceptSchemeHasTopConceptIterator theConceptScheme = (ConceptSchemeHasTopConceptIterator)findAncestorWithClass(this, ConceptSchemeHasTopConceptIterator.class);
			pageContext.getOut().print(theConceptScheme.getHasTopConcept());
		} catch (Exception e) {
			log.error("Can't find enclosing ConceptScheme for hasTopConcept tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConceptScheme for hasTopConcept tag ");
		}
		return SKIP_BODY;
	}
}

