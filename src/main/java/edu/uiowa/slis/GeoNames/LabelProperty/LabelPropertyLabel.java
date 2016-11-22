package edu.uiowa.slis.GeoNames.LabelProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LabelPropertyLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static LabelPropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LabelPropertyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LabelProperty theLabelProperty = (LabelProperty)findAncestorWithClass(this, LabelProperty.class);
			if (!theLabelProperty.commitNeeded) {
				pageContext.getOut().print(theLabelProperty.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LabelProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LabelProperty for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			LabelProperty theLabelProperty = (LabelProperty)findAncestorWithClass(this, LabelProperty.class);
			return theLabelProperty.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing LabelProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LabelProperty for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			LabelProperty theLabelProperty = (LabelProperty)findAncestorWithClass(this, LabelProperty.class);
			theLabelProperty.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing LabelProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LabelProperty for label tag ");
		}
	}
}

