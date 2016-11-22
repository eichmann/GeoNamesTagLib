package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Nothing theNothing = (Nothing)findAncestorWithClass(this, Nothing.class);
			if (!theNothing.commitNeeded) {
				pageContext.getOut().print(theNothing.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Nothing theNothing = (Nothing)findAncestorWithClass(this, Nothing.class);
			return theNothing.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Nothing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Nothing theNothing = (Nothing)findAncestorWithClass(this, Nothing.class);
			theNothing.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for subjectURI tag ");
		}
	}
}

