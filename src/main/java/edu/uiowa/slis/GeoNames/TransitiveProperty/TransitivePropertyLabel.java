package edu.uiowa.slis.GeoNames.TransitiveProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TransitivePropertyLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static TransitivePropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TransitivePropertyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			TransitiveProperty theTransitiveProperty = (TransitiveProperty)findAncestorWithClass(this, TransitiveProperty.class);
			if (!theTransitiveProperty.commitNeeded) {
				pageContext.getOut().print(theTransitiveProperty.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing TransitiveProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransitiveProperty for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			TransitiveProperty theTransitiveProperty = (TransitiveProperty)findAncestorWithClass(this, TransitiveProperty.class);
			return theTransitiveProperty.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing TransitiveProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransitiveProperty for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			TransitiveProperty theTransitiveProperty = (TransitiveProperty)findAncestorWithClass(this, TransitiveProperty.class);
			theTransitiveProperty.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing TransitiveProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransitiveProperty for label tag ");
		}
	}
}

