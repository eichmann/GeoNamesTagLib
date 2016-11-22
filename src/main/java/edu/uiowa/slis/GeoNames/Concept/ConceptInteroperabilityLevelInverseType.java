package edu.uiowa.slis.GeoNames.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptInteroperabilityLevelInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ConceptInteroperabilityLevelInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptInteroperabilityLevelInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptInteroperabilityLevelInverseIterator theConceptInteroperabilityLevelInverseIterator = (ConceptInteroperabilityLevelInverseIterator)findAncestorWithClass(this, ConceptInteroperabilityLevelInverseIterator.class);
			pageContext.getOut().print(theConceptInteroperabilityLevelInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for interoperabilityLevel tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for interoperabilityLevel tag ");
		}
		return SKIP_BODY;
	}
}

