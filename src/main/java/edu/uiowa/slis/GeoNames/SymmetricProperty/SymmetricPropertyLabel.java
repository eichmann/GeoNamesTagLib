package edu.uiowa.slis.GeoNames.SymmetricProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SymmetricPropertyLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static SymmetricPropertyLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(SymmetricPropertyLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SymmetricProperty theSymmetricProperty = (SymmetricProperty)findAncestorWithClass(this, SymmetricProperty.class);
			if (!theSymmetricProperty.commitNeeded) {
				pageContext.getOut().print(theSymmetricProperty.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SymmetricProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SymmetricProperty for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			SymmetricProperty theSymmetricProperty = (SymmetricProperty)findAncestorWithClass(this, SymmetricProperty.class);
			return theSymmetricProperty.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing SymmetricProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SymmetricProperty for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			SymmetricProperty theSymmetricProperty = (SymmetricProperty)findAncestorWithClass(this, SymmetricProperty.class);
			theSymmetricProperty.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing SymmetricProperty for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing SymmetricProperty for label tag ");
		}
	}
}

