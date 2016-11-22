package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			if (!theAgent.commitNeeded) {
				pageContext.getOut().print(theAgent.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			return theAgent.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Agent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			theAgent.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for subjectURI tag ");
		}
	}
}

