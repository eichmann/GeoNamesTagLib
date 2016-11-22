package edu.uiowa.slis.GeoNames.Group;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GroupSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GroupSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(GroupSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			if (!theGroup.commitNeeded) {
				pageContext.getOut().print(theGroup.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Group for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			return theGroup.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Group for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Group theGroup = (Group)findAncestorWithClass(this, Group.class);
			theGroup.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Group for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Group for subjectURI tag ");
		}
	}
}

