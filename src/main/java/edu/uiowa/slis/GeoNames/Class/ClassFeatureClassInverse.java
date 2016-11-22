package edu.uiowa.slis.GeoNames.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassFeatureClassInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ClassFeatureClassInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassFeatureClassInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClassFeatureClassInverseIterator theClassFeatureClassInverseIterator = (ClassFeatureClassInverseIterator)findAncestorWithClass(this, ClassFeatureClassInverseIterator.class);
			pageContext.getOut().print(theClassFeatureClassInverseIterator.getFeatureClassInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for featureClass tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for featureClass tag ");
		}
		return SKIP_BODY;
	}
}

