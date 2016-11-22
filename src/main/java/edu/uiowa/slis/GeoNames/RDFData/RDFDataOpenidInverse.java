package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataOpenidInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataOpenidInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataOpenidInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataOpenidInverseIterator theRDFDataOpenidInverseIterator = (RDFDataOpenidInverseIterator)findAncestorWithClass(this, RDFDataOpenidInverseIterator.class);
			pageContext.getOut().print(theRDFDataOpenidInverseIterator.getOpenidInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for openid tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for openid tag ");
		}
		return SKIP_BODY;
	}
}

