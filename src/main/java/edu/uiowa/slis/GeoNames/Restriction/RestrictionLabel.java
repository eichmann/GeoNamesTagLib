package edu.uiowa.slis.GeoNames.Restriction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RestrictionLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RestrictionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(RestrictionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Restriction theRestriction = (Restriction)findAncestorWithClass(this, Restriction.class);
			if (!theRestriction.commitNeeded) {
				pageContext.getOut().print(theRestriction.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Restriction for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Restriction for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Restriction theRestriction = (Restriction)findAncestorWithClass(this, Restriction.class);
			return theRestriction.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Restriction for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Restriction for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Restriction theRestriction = (Restriction)findAncestorWithClass(this, Restriction.class);
			theRestriction.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Restriction for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Restriction for label tag ");
		}
	}
}

