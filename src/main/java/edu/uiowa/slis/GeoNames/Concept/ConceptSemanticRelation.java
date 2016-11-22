package edu.uiowa.slis.GeoNames.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptSemanticRelation extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ConceptSemanticRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptSemanticRelation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConceptSemanticRelationIterator theConcept = (ConceptSemanticRelationIterator)findAncestorWithClass(this, ConceptSemanticRelationIterator.class);
			pageContext.getOut().print(theConcept.getSemanticRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Concept for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Concept for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

