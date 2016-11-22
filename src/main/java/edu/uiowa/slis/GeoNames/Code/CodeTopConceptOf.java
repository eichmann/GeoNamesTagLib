package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeTopConceptOf extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeTopConceptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeTopConceptOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeTopConceptOfIterator theCode = (CodeTopConceptOfIterator)findAncestorWithClass(this, CodeTopConceptOfIterator.class);
			pageContext.getOut().print(theCode.getTopConceptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for topConceptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for topConceptOf tag ");
		}
		return SKIP_BODY;
	}
}

