package edu.uiowa.slis.GeoNames.Class;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ClassLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ClassLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ClassLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Class theClass = (Class)findAncestorWithClass(this, Class.class);
			if (!theClass.commitNeeded) {
				pageContext.getOut().print(theClass.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Class for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Class theClass = (Class)findAncestorWithClass(this, Class.class);
			return theClass.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Class for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Class theClass = (Class)findAncestorWithClass(this, Class.class);
			theClass.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Class for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Class for label tag ");
		}
	}
}

