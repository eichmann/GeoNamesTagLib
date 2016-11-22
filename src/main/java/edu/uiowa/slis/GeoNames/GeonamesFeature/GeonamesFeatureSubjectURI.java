package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeature theGeonamesFeature = (GeonamesFeature)findAncestorWithClass(this, GeonamesFeature.class);
			if (!theGeonamesFeature.commitNeeded) {
				pageContext.getOut().print(theGeonamesFeature.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			GeonamesFeature theGeonamesFeature = (GeonamesFeature)findAncestorWithClass(this, GeonamesFeature.class);
			return theGeonamesFeature.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeonamesFeature for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			GeonamesFeature theGeonamesFeature = (GeonamesFeature)findAncestorWithClass(this, GeonamesFeature.class);
			theGeonamesFeature.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for subjectURI tag ");
		}
	}
}

