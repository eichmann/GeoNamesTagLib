package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentGender extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentGender currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentGender.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			if (!theAgent.commitNeeded) {
				pageContext.getOut().print(theAgent.getGender());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for gender tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for gender tag ");
		}
		return SKIP_BODY;
	}

	public String getGender() throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			return theAgent.getGender();
		} catch (Exception e) {
			log.error(" Can't find enclosing Agent for gender tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for gender tag ");
		}
	}

	public void setGender(String gender) throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			theAgent.setGender(gender);
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for gender tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for gender tag ");
		}
	}
}

