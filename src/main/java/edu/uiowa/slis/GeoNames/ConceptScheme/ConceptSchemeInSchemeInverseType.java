package edu.uiowa.slis.GeoNames.ConceptScheme;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptSchemeInSchemeInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ConceptSchemeInSchemeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptSchemeInSchemeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConceptSchemeInSchemeInverseIterator theConceptSchemeInSchemeInverseIterator = (ConceptSchemeInSchemeInverseIterator)findAncestorWithClass(this, ConceptSchemeInSchemeInverseIterator.class);
			pageContext.getOut().print(theConceptSchemeInSchemeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConceptScheme for inScheme tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConceptScheme for inScheme tag ");
		}
		return SKIP_BODY;
	}
}

