package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			RDFData theRDFData = (RDFData)findAncestorWithClass(this, RDFData.class);
			if (!theRDFData.commitNeeded) {
				pageContext.getOut().print(theRDFData.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			RDFData theRDFData = (RDFData)findAncestorWithClass(this, RDFData.class);
			return theRDFData.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing RDFData for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			RDFData theRDFData = (RDFData)findAncestorWithClass(this, RDFData.class);
			theRDFData.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for subjectURI tag ");
		}
	}
}

