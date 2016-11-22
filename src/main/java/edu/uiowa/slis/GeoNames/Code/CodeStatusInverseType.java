package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeStatusInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeStatusInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeStatusInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeStatusInverseIterator theCodeStatusInverseIterator = (CodeStatusInverseIterator)findAncestorWithClass(this, CodeStatusInverseIterator.class);
			pageContext.getOut().print(theCodeStatusInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for status tag ");
		}
		return SKIP_BODY;
	}
}

