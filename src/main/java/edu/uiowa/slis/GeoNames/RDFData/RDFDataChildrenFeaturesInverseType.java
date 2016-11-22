package edu.uiowa.slis.GeoNames.RDFData;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RDFDataChildrenFeaturesInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static RDFDataChildrenFeaturesInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(RDFDataChildrenFeaturesInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RDFDataChildrenFeaturesInverseIterator theRDFDataChildrenFeaturesInverseIterator = (RDFDataChildrenFeaturesInverseIterator)findAncestorWithClass(this, RDFDataChildrenFeaturesInverseIterator.class);
			pageContext.getOut().print(theRDFDataChildrenFeaturesInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing RDFData for childrenFeatures tag ", e);
			throw new JspTagException("Error: Can't find enclosing RDFData for childrenFeatures tag ");
		}
		return SKIP_BODY;
	}
}

