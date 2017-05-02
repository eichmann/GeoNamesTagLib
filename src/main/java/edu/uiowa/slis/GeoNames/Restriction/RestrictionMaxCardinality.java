package edu.uiowa.slis.GeoNames.Restriction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RestrictionMaxCardinality extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RestrictionMaxCardinality currentInstance = null;
	private static final Log log = LogFactory.getLog(RestrictionMaxCardinality.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RestrictionMaxCardinalityIterator theRestriction = (RestrictionMaxCardinalityIterator)findAncestorWithClass(this, RestrictionMaxCardinalityIterator.class);
			pageContext.getOut().print(theRestriction.getMaxCardinality());
		} catch (Exception e) {
			log.error("Can't find enclosing Restriction for maxCardinality tag ", e);
			throw new JspTagException("Error: Can't find enclosing Restriction for maxCardinality tag ");
		}
		return SKIP_BODY;
	}
}

