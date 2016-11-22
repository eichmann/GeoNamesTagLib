package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingPage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingPage currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingPage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingPageIterator theNothing = (NothingPageIterator)findAncestorWithClass(this, NothingPageIterator.class);
			pageContext.getOut().print(theNothing.getPage());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for page tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for page tag ");
		}
		return SKIP_BODY;
	}
}

