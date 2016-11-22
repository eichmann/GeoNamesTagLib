package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupBirthday extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupBirthday currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupBirthday.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			if (!theGroup.commitNeeded) {
				pageContext.getOut().print(theGroup.getBirthday());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Group for birthday tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for birthday tag ");
		}
		return SKIP_BODY;
	}

	public String getBirthday() throws JspTagException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			return theGroup.getBirthday();
		} catch (Exception e) {
			log.error(" Can't find enclosing Group for birthday tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for birthday tag ");
		}
	}

	public void setBirthday(String birthday) throws JspTagException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			theGroup.setBirthday(birthday);
		} catch (Exception e) {
			log.error("Can't find enclosing Group for birthday tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for birthday tag ");
		}
	}
}

