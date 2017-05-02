package edu.uiowa.slis.GeoNames.SymmetricProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SymmetricPropertyTheType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static SymmetricPropertyTheType currentInstance = null;
	private static final Log log = LogFactory.getLog(SymmetricPropertyTheType.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SymmetricPropertyTheTypeIterator theSymmetricProperty = (SymmetricPropertyTheTypeIterator)findAncestorWithClass(this, SymmetricPropertyTheTypeIterator.class);
			pageContext.getOut().print(theSymmetricProperty.getTheType());
		} catch (Exception e) {
			log.error("Can't find enclosing SymmetricProperty for theType tag ", e);
			throw new JspTagException("Error: Can't find enclosing SymmetricProperty for theType tag ");
		}
		return SKIP_BODY;
	}
}

