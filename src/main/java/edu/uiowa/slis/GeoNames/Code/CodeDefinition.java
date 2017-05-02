package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeDefinition extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeDefinition currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeDefinition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeDefinitionIterator theCode = (CodeDefinitionIterator)findAncestorWithClass(this, CodeDefinitionIterator.class);
			pageContext.getOut().print(theCode.getDefinition());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for definition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for definition tag ");
		}
		return SKIP_BODY;
	}
}

