package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeRepresentationTechniqueInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeRepresentationTechniqueInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeRepresentationTechniqueInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CodeRepresentationTechniqueInverseIterator theCodeRepresentationTechniqueInverseIterator = (CodeRepresentationTechniqueInverseIterator)findAncestorWithClass(this, CodeRepresentationTechniqueInverseIterator.class);
			pageContext.getOut().print(theCodeRepresentationTechniqueInverseIterator.getRepresentationTechniqueInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for representationTechnique tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for representationTechnique tag ");
		}
		return SKIP_BODY;
	}
}

