package edu.uiowa.slis.GeoNames.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassFeatureClassInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ClassFeatureClassInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassFeatureClassInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ClassFeatureClassInverseIterator theClassFeatureClassInverseIterator = (ClassFeatureClassInverseIterator)findAncestorWithClass(this, ClassFeatureClassInverseIterator.class);
			pageContext.getOut().print(theClassFeatureClassInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for featureClass tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for featureClass tag ");
		}
		return SKIP_BODY;
	}
}

