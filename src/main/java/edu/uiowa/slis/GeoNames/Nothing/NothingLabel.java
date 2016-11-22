package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Nothing theNothing = (Nothing)findAncestorWithClass(this, Nothing.class);
			if (!theNothing.commitNeeded) {
				pageContext.getOut().print(theNothing.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Nothing theNothing = (Nothing)findAncestorWithClass(this, Nothing.class);
			return theNothing.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Nothing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Nothing theNothing = (Nothing)findAncestorWithClass(this, Nothing.class);
			theNothing.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for label tag ");
		}
	}
}

