package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingMboxInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingMboxInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingMboxInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NothingMboxInverseIterator theNothingMboxInverseIterator = (NothingMboxInverseIterator)findAncestorWithClass(this, NothingMboxInverseIterator.class);
			pageContext.getOut().print(theNothingMboxInverseIterator.getMboxInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for mbox tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for mbox tag ");
		}
		return SKIP_BODY;
	}
}

