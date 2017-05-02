package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeInSchemeType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeInSchemeType currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeInSchemeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeInSchemeIterator theCodeInSchemeIterator = (CodeInSchemeIterator)findAncestorWithClass(this, CodeInSchemeIterator.class);
			pageContext.getOut().print(theCodeInSchemeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for inScheme tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for inScheme tag ");
		}
		return SKIP_BODY;
	}
}

