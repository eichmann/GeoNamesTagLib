package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeFocus extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeFocus.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeFocusIterator theCode = (CodeFocusIterator)findAncestorWithClass(this, CodeFocusIterator.class);
			pageContext.getOut().print(theCode.getFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for focus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for focus tag ");
		}
		return SKIP_BODY;
	}
}

