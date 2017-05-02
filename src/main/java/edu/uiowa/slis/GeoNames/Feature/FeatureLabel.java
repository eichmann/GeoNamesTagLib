package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Feature theFeature = (Feature)findAncestorWithClass(this, Feature.class);
			if (!theFeature.commitNeeded) {
				pageContext.getOut().print(theFeature.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Feature theFeature = (Feature)findAncestorWithClass(this, Feature.class);
			return theFeature.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Feature for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Feature theFeature = (Feature)findAncestorWithClass(this, Feature.class);
			theFeature.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for label tag ");
		}
	}
}

