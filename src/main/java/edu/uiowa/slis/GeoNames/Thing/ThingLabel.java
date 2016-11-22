package edu.uiowa.slis.GeoNames.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ThingLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			if (!theThing.commitNeeded) {
				pageContext.getOut().print(theThing.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			return theThing.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Thing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			theThing.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for label tag ");
		}
	}
}

