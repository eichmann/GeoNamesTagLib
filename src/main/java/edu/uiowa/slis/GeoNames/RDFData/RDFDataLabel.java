package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			RDFData theRDFData = (RDFData)findAncestorWithClass(this, RDFData.class);
			if (!theRDFData.commitNeeded) {
				pageContext.getOut().print(theRDFData.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			RDFData theRDFData = (RDFData)findAncestorWithClass(this, RDFData.class);
			return theRDFData.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing RDFData for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			RDFData theRDFData = (RDFData)findAncestorWithClass(this, RDFData.class);
			theRDFData.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for label tag ");
		}
	}
}

