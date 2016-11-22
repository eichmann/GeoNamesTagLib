package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupAge extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupAge currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupAge.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			if (!theGroup.commitNeeded) {
				pageContext.getOut().print(theGroup.getAge());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Group for age tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for age tag ");
		}
		return SKIP_BODY;
	}

	public String getAge() throws JspTagException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			return theGroup.getAge();
		} catch (Exception e) {
			log.error(" Can't find enclosing Group for age tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for age tag ");
		}
	}

	public void setAge(String age) throws JspTagException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			theGroup.setAge(age);
		} catch (Exception e) {
			log.error("Can't find enclosing Group for age tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for age tag ");
		}
	}
}

