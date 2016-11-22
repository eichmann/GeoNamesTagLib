package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Code theCode = (Code)findAncestorWithClass(this, Code.class);
			if (!theCode.commitNeeded) {
				pageContext.getOut().print(theCode.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Code for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Code theCode = (Code)findAncestorWithClass(this, Code.class);
			return theCode.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Code for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Code theCode = (Code)findAncestorWithClass(this, Code.class);
			theCode.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Code for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for label tag ");
		}
	}
}

