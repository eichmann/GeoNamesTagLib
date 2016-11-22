package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataOpenidInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataOpenidInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataOpenidInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataOpenidInverseIterator theRDFDataOpenidInverseIterator = (RDFDataOpenidInverseIterator)findAncestorWithClass(this, RDFDataOpenidInverseIterator.class);
			pageContext.getOut().print(theRDFDataOpenidInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for openid tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for openid tag ");
		}
		return SKIP_BODY;
	}
}

