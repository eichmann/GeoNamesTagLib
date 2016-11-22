package edu.uiowa.slis.GeoNames.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassHasTopConcept extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ClassHasTopConcept currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassHasTopConcept.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ClassHasTopConceptIterator theClass = (ClassHasTopConceptIterator)findAncestorWithClass(this, ClassHasTopConceptIterator.class);
			pageContext.getOut().print(theClass.getHasTopConcept());
		} catch (Exception e) {
			log.error("Can't find enclosing Class for hasTopConcept tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for hasTopConcept tag ");
		}
		return SKIP_BODY;
	}
}

