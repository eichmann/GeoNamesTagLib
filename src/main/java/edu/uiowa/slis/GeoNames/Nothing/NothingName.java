package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingName currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingNameIterator theNothing = (NothingNameIterator)findAncestorWithClass(this, NothingNameIterator.class);
			pageContext.getOut().print(theNothing.getName());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for name tag ");
		}
		return SKIP_BODY;
	}
}

