package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeSemanticRelation extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeSemanticRelation currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeSemanticRelation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeSemanticRelationIterator theCode = (CodeSemanticRelationIterator)findAncestorWithClass(this, CodeSemanticRelationIterator.class);
			pageContext.getOut().print(theCode.getSemanticRelation());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for semanticRelation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for semanticRelation tag ");
		}
		return SKIP_BODY;
	}
}

