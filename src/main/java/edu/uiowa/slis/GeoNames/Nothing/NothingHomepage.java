package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingHomepage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingHomepage currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingHomepage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingHomepageIterator theNothing = (NothingHomepageIterator)findAncestorWithClass(this, NothingHomepageIterator.class);
			pageContext.getOut().print(theNothing.getHomepage());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for homepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for homepage tag ");
		}
		return SKIP_BODY;
	}
}

