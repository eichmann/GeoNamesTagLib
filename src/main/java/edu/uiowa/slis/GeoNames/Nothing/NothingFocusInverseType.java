package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingFocusInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingFocusInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingFocusInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NothingFocusInverseIterator theNothingFocusInverseIterator = (NothingFocusInverseIterator)findAncestorWithClass(this, NothingFocusInverseIterator.class);
			pageContext.getOut().print(theNothingFocusInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for focus tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for focus tag ");
		}
		return SKIP_BODY;
	}
}

