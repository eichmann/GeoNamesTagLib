package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataChildrenFeaturesInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataChildrenFeaturesInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataChildrenFeaturesInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataChildrenFeaturesInverseIterator theRDFDataChildrenFeaturesInverseIterator = (RDFDataChildrenFeaturesInverseIterator)findAncestorWithClass(this, RDFDataChildrenFeaturesInverseIterator.class);
			pageContext.getOut().print(theRDFDataChildrenFeaturesInverseIterator.getChildrenFeaturesInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for childrenFeatures tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for childrenFeatures tag ");
		}
		return SKIP_BODY;
	}
}

