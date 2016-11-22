package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingCurrentProjectInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingCurrentProjectInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingCurrentProjectInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NothingCurrentProjectInverseIterator theNothingCurrentProjectInverseIterator = (NothingCurrentProjectInverseIterator)findAncestorWithClass(this, NothingCurrentProjectInverseIterator.class);
			pageContext.getOut().print(theNothingCurrentProjectInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for currentProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for currentProject tag ");
		}
		return SKIP_BODY;
	}
}

