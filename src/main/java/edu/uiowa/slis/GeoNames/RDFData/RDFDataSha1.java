package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataSha1 extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataSha1 currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataSha1.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			RDFDataSha1Iterator theRDFData = (RDFDataSha1Iterator)findAncestorWithClass(this, RDFDataSha1Iterator.class);
			pageContext.getOut().print(theRDFData.getSha1());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for sha1 tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for sha1 tag ");
		}
		return SKIP_BODY;
	}
}

