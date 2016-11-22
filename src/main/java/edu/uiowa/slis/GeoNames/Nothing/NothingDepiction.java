package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingDepiction extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingDepiction currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingDepiction.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingDepictionIterator theNothing = (NothingDepictionIterator)findAncestorWithClass(this, NothingDepictionIterator.class);
			pageContext.getOut().print(theNothing.getDepiction());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for depiction tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for depiction tag ");
		}
		return SKIP_BODY;
	}
}

