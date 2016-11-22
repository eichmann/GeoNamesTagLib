package edu.uiowa.slis.GeoNames.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptFocus extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ConceptFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptFocus.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConceptFocusIterator theConcept = (ConceptFocusIterator)findAncestorWithClass(this, ConceptFocusIterator.class);
			pageContext.getOut().print(theConcept.getFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for focus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for focus tag ");
		}
		return SKIP_BODY;
	}
}

