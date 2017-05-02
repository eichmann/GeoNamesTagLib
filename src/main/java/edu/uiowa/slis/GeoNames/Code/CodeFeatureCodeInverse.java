package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeFeatureCodeInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeFeatureCodeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeFeatureCodeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeFeatureCodeInverseIterator theCodeFeatureCodeInverseIterator = (CodeFeatureCodeInverseIterator)findAncestorWithClass(this, CodeFeatureCodeInverseIterator.class);
			pageContext.getOut().print(theCodeFeatureCodeInverseIterator.getFeatureCodeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for featureCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for featureCode tag ");
		}
		return SKIP_BODY;
	}
}

