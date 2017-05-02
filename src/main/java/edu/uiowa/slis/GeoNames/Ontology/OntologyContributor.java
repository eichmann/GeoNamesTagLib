package edu.uiowa.slis.GeoNames.Ontology;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OntologyContributor extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OntologyContributor currentInstance = null;
	private static final Log log = LogFactory.getLog(OntologyContributor.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OntologyContributorIterator theOntology = (OntologyContributorIterator)findAncestorWithClass(this, OntologyContributorIterator.class);
			pageContext.getOut().print(theOntology.getContributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Ontology for contributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Ontology for contributor tag ");
		}
		return SKIP_BODY;
	}
}

