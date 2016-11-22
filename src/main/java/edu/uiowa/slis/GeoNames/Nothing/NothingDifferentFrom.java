package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingDifferentFrom extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingDifferentFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingDifferentFrom.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingDifferentFromIterator theNothing = (NothingDifferentFromIterator)findAncestorWithClass(this, NothingDifferentFromIterator.class);
			pageContext.getOut().print(theNothing.getDifferentFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for differentFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for differentFrom tag ");
		}
		return SKIP_BODY;
	}
}

