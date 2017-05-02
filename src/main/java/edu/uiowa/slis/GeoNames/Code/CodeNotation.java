package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeNotation extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeNotation currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeNotation.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeNotationIterator theCode = (CodeNotationIterator)findAncestorWithClass(this, CodeNotationIterator.class);
			pageContext.getOut().print(theCode.getNotation());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for notation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for notation tag ");
		}
		return SKIP_BODY;
	}
}

