package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodePrefLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodePrefLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CodePrefLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodePrefLabelIterator theCode = (CodePrefLabelIterator)findAncestorWithClass(this, CodePrefLabelIterator.class);
			pageContext.getOut().print(theCode.getPrefLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for prefLabel tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for prefLabel tag ");
		}
		return SKIP_BODY;
	}
}

