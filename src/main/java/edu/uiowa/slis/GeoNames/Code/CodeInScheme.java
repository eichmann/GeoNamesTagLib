package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeInScheme extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeInScheme currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeInScheme.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeInSchemeIterator theCode = (CodeInSchemeIterator)findAncestorWithClass(this, CodeInSchemeIterator.class);
			pageContext.getOut().print(theCode.getInScheme());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for inScheme tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for inScheme tag ");
		}
		return SKIP_BODY;
	}
}

