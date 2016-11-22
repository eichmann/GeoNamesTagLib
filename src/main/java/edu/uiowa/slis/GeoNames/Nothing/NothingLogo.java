package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingLogo extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingLogo currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingLogo.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingLogoIterator theNothing = (NothingLogoIterator)findAncestorWithClass(this, NothingLogoIterator.class);
			pageContext.getOut().print(theNothing.getLogo());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for logo tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for logo tag ");
		}
		return SKIP_BODY;
	}
}

