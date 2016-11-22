package edu.uiowa.slis.GeoNames.Project;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProjectLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ProjectLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ProjectLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Project theProject = (Project)findAncestorWithClass(this, Project.class);
			if (!theProject.commitNeeded) {
				pageContext.getOut().print(theProject.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Project for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Project for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Project theProject = (Project)findAncestorWithClass(this, Project.class);
			return theProject.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Project for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Project for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Project theProject = (Project)findAncestorWithClass(this, Project.class);
			theProject.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Project for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Project for label tag ");
		}
	}
}

