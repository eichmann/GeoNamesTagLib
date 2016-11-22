package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingTheme extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingTheme currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingTheme.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingThemeIterator theNothing = (NothingThemeIterator)findAncestorWithClass(this, NothingThemeIterator.class);
			pageContext.getOut().print(theNothing.getTheme());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for theme tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for theme tag ");
		}
		return SKIP_BODY;
	}
}

