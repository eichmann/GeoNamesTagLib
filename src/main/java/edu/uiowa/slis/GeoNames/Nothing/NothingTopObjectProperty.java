package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingTopObjectProperty extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingTopObjectProperty currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingTopObjectProperty.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingTopObjectPropertyIterator theNothing = (NothingTopObjectPropertyIterator)findAncestorWithClass(this, NothingTopObjectPropertyIterator.class);
			pageContext.getOut().print(theNothing.getTopObjectProperty());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for topObjectProperty tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for topObjectProperty tag ");
		}
		return SKIP_BODY;
	}
}

