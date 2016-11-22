package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			if (!theGroup.commitNeeded) {
				pageContext.getOut().print(theGroup.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Group for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			return theGroup.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Group for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			theGroup.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Group for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for label tag ");
		}
	}
}

