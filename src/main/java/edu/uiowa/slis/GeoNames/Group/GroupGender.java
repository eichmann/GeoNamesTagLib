package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupGender extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupGender currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupGender.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			if (!theGroup.commitNeeded) {
				pageContext.getOut().print(theGroup.getGender());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Group for gender tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for gender tag ");
		}
		return SKIP_BODY;
	}

	public String getGender() throws JspTagException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			return theGroup.getGender();
		} catch (Exception e) {
			log.error(" Can't find enclosing Group for gender tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for gender tag ");
		}
	}

	public void setGender(String gender) throws JspTagException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			theGroup.setGender(gender);
		} catch (Exception e) {
			log.error("Can't find enclosing Group for gender tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for gender tag ");
		}
	}
}

