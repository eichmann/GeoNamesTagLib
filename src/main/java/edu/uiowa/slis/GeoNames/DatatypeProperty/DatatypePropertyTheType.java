package edu.uiowa.slis.GeoNames.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyTheType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DatatypePropertyTheType currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyTheType.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyTheTypeIterator theDatatypeProperty = (DatatypePropertyTheTypeIterator)findAncestorWithClass(this, DatatypePropertyTheTypeIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getTheType());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for theType tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for theType tag ");
		}
		return SKIP_BODY;
	}
}

