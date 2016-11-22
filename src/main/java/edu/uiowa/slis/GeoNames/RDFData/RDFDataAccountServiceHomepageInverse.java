package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataAccountServiceHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataAccountServiceHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataAccountServiceHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataAccountServiceHomepageInverseIterator theRDFDataAccountServiceHomepageInverseIterator = (RDFDataAccountServiceHomepageInverseIterator)findAncestorWithClass(this, RDFDataAccountServiceHomepageInverseIterator.class);
			pageContext.getOut().print(theRDFDataAccountServiceHomepageInverseIterator.getAccountServiceHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for accountServiceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for accountServiceHomepage tag ");
		}
		return SKIP_BODY;
	}
}
