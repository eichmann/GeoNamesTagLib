package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingBottomObjectProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingBottomObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingBottomObjectProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingBottomObjectPropertyIterator theNothing = (NothingBottomObjectPropertyIterator)findAncestorWithClass(this, NothingBottomObjectPropertyIterator.class);
			pageContext.getOut().print(theNothing.getBottomObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for bottomObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for bottomObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

