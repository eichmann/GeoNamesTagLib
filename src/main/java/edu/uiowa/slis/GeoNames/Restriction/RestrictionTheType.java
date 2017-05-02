package edu.uiowa.slis.GeoNames.Restriction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RestrictionTheType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RestrictionTheType currentInstance = null;
	private static final Log log = LogFactory.getLog(RestrictionTheType.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RestrictionTheTypeIterator theRestriction = (RestrictionTheTypeIterator)findAncestorWithClass(this, RestrictionTheTypeIterator.class);
			pageContext.getOut().print(theRestriction.getTheType());
		} catch (Exception e) {
			log.error("Can't find enclosing Restriction for theType tag ", e);
			throw new JspTagException("Error: Can't find enclosing Restriction for theType tag ");
		}
		return SKIP_BODY;
	}
}

