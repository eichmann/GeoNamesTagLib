package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeInteroperabilityLevelInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeInteroperabilityLevelInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeInteroperabilityLevelInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeInteroperabilityLevelInverseIterator theCodeInteroperabilityLevelInverseIterator = (CodeInteroperabilityLevelInverseIterator)findAncestorWithClass(this, CodeInteroperabilityLevelInverseIterator.class);
			pageContext.getOut().print(theCodeInteroperabilityLevelInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for interoperabilityLevel tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for interoperabilityLevel tag ");
		}
		return SKIP_BODY;
	}
}

