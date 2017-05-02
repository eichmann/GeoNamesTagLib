package edu.uiowa.slis.GeoNames.Restriction;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RestrictionSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RestrictionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(RestrictionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Restriction theRestriction = (Restriction)findAncestorWithClass(this, Restriction.class);
			if (!theRestriction.commitNeeded) {
				pageContext.getOut().print(theRestriction.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Restriction for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Restriction for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Restriction theRestriction = (Restriction)findAncestorWithClass(this, Restriction.class);
			return theRestriction.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Restriction for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Restriction for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Restriction theRestriction = (Restriction)findAncestorWithClass(this, Restriction.class);
			theRestriction.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Restriction for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Restriction for subjectURI tag ");
		}
	}
}

