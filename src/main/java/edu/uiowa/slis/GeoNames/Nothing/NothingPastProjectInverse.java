package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingPastProjectInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingPastProjectInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingPastProjectInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NothingPastProjectInverseIterator theNothingPastProjectInverseIterator = (NothingPastProjectInverseIterator)findAncestorWithClass(this, NothingPastProjectInverseIterator.class);
			pageContext.getOut().print(theNothingPastProjectInverseIterator.getPastProjectInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for pastProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for pastProject tag ");
		}
		return SKIP_BODY;
	}
}

