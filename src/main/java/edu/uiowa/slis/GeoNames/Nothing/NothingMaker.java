package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingMaker extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingMaker currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingMaker.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingMakerIterator theNothing = (NothingMakerIterator)findAncestorWithClass(this, NothingMakerIterator.class);
			pageContext.getOut().print(theNothing.getMaker());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for maker tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for maker tag ");
		}
		return SKIP_BODY;
	}
}

