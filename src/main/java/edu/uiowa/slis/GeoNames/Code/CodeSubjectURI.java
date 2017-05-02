package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Code theCode = (Code)findAncestorWithClass(this, Code.class);
			if (!theCode.commitNeeded) {
				pageContext.getOut().print(theCode.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Code for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Code theCode = (Code)findAncestorWithClass(this, Code.class);
			return theCode.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Code for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Code theCode = (Code)findAncestorWithClass(this, Code.class);
			theCode.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Code for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for subjectURI tag ");
		}
	}
}

