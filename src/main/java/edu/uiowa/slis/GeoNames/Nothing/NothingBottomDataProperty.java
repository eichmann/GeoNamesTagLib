package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingBottomDataProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingBottomDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingBottomDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingBottomDataPropertyIterator theNothing = (NothingBottomDataPropertyIterator)findAncestorWithClass(this, NothingBottomDataPropertyIterator.class);
			pageContext.getOut().print(theNothing.getBottomDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for bottomDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for bottomDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

