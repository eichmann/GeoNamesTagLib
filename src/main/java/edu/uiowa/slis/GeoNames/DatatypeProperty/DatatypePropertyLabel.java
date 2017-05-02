package edu.uiowa.slis.GeoNames.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DatatypePropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyLabel.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyLabelIterator theDatatypeProperty = (DatatypePropertyLabelIterator)findAncestorWithClass(this, DatatypePropertyLabelIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getLabel());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for label tag ");
		}
		return SKIP_BODY;
	}
}

