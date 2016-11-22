package edu.uiowa.slis.GeoNames.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassInSchemeInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ClassInSchemeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassInSchemeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClassInSchemeInverseIterator theClassInSchemeInverseIterator = (ClassInSchemeInverseIterator)findAncestorWithClass(this, ClassInSchemeInverseIterator.class);
			pageContext.getOut().print(theClassInSchemeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for inScheme tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for inScheme tag ");
		}
		return SKIP_BODY;
	}
}

