package edu.uiowa.slis.GeoNames.ConceptScheme;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConceptSchemeLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ConceptSchemeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ConceptSchemeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConceptScheme theConceptScheme = (ConceptScheme)findAncestorWithClass(this, ConceptScheme.class);
			if (!theConceptScheme.commitNeeded) {
				pageContext.getOut().print(theConceptScheme.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConceptScheme for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConceptScheme for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			ConceptScheme theConceptScheme = (ConceptScheme)findAncestorWithClass(this, ConceptScheme.class);
			return theConceptScheme.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConceptScheme for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConceptScheme for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			ConceptScheme theConceptScheme = (ConceptScheme)findAncestorWithClass(this, ConceptScheme.class);
			theConceptScheme.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing ConceptScheme for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConceptScheme for label tag ");
		}
	}
}

