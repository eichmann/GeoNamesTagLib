package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeMemberInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeMemberInverseIterator theCodeMemberInverseIterator = (CodeMemberInverseIterator)findAncestorWithClass(this, CodeMemberInverseIterator.class);
			pageContext.getOut().print(theCodeMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for member tag ");
		}
		return SKIP_BODY;
	}
}

