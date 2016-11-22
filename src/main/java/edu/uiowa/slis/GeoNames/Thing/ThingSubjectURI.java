package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			if (!theThing.commitNeeded) {
				pageContext.getOut().print(theThing.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			return theThing.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Thing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			theThing.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for subjectURI tag ");
		}
	}
}

