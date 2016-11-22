package edu.uiowa.slis.GeoNames.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptInteroperabilityLevelInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ConceptInteroperabilityLevelInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptInteroperabilityLevelInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptInteroperabilityLevelInverseIterator theConceptInteroperabilityLevelInverseIterator = (ConceptInteroperabilityLevelInverseIterator)findAncestorWithClass(this, ConceptInteroperabilityLevelInverseIterator.class);
			pageContext.getOut().print(theConceptInteroperabilityLevelInverseIterator.getInteroperabilityLevelInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for interoperabilityLevel tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for interoperabilityLevel tag ");
		}
		return SKIP_BODY;
	}
}

