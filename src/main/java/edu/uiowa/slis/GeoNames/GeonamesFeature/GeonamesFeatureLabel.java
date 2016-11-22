package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeature theGeonamesFeature = (GeonamesFeature)findAncestorWithClass(this, GeonamesFeature.class);
			if (!theGeonamesFeature.commitNeeded) {
				pageContext.getOut().print(theGeonamesFeature.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			GeonamesFeature theGeonamesFeature = (GeonamesFeature)findAncestorWithClass(this, GeonamesFeature.class);
			return theGeonamesFeature.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing GeonamesFeature for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			GeonamesFeature theGeonamesFeature = (GeonamesFeature)findAncestorWithClass(this, GeonamesFeature.class);
			theGeonamesFeature.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for label tag ");
		}
	}
}

