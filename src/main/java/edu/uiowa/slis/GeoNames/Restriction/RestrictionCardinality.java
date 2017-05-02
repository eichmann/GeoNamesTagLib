package edu.uiowa.slis.GeoNames.Restriction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RestrictionCardinality extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RestrictionCardinality currentInstance = null;
	private static final Log log = LogFactory.getLog(RestrictionCardinality.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RestrictionCardinalityIterator theRestriction = (RestrictionCardinalityIterator)findAncestorWithClass(this, RestrictionCardinalityIterator.class);
			pageContext.getOut().print(theRestriction.getCardinality());
		} catch (Exception e) {
			log.error("Can't find enclosing Restriction for cardinality tag ", e);
			throw new JspTagException("Error: Can't find enclosing Restriction for cardinality tag ");
		}
		return SKIP_BODY;
	}
}

