package edu.uiowa.slis.GeoNames.Project;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProjectSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static ProjectSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ProjectSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Project theProject = (Project)findAncestorWithClass(this, Project.class);
			if (!theProject.commitNeeded) {
				pageContext.getOut().print(theProject.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Project for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Project for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Project theProject = (Project)findAncestorWithClass(this, Project.class);
			return theProject.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Project for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Project for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Project theProject = (Project)findAncestorWithClass(this, Project.class);
			theProject.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Project for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Project for subjectURI tag ");
		}
	}
}

