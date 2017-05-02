package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Feature theFeature = (Feature)findAncestorWithClass(this, Feature.class);
			if (!theFeature.commitNeeded) {
				pageContext.getOut().print(theFeature.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Feature theFeature = (Feature)findAncestorWithClass(this, Feature.class);
			return theFeature.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Feature for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Feature theFeature = (Feature)findAncestorWithClass(this, Feature.class);
			theFeature.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for subjectURI tag ");
		}
	}
}

