package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingSameAs extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingSameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingSameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingSameAsIterator theNothing = (NothingSameAsIterator)findAncestorWithClass(this, NothingSameAsIterator.class);
			pageContext.getOut().print(theNothing.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

