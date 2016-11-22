package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingTopDataProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingTopDataProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingTopDataProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingTopDataPropertyIterator theNothing = (NothingTopDataPropertyIterator)findAncestorWithClass(this, NothingTopDataPropertyIterator.class);
			pageContext.getOut().print(theNothing.getTopDataProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for topDataProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for topDataProperty tag ");
		}
		return SKIP_BODY;
	}
}

