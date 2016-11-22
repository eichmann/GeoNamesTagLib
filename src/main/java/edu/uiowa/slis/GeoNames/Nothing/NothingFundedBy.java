package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingFundedBy extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingFundedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingFundedBy.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingFundedByIterator theNothing = (NothingFundedByIterator)findAncestorWithClass(this, NothingFundedByIterator.class);
			pageContext.getOut().print(theNothing.getFundedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for fundedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for fundedBy tag ");
		}
		return SKIP_BODY;
	}
}

