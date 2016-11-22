package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAge extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentAge currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAge.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			if (!theAgent.commitNeeded) {
				pageContext.getOut().print(theAgent.getAge());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for age tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for age tag ");
		}
		return SKIP_BODY;
	}

	public String getAge() throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			return theAgent.getAge();
		} catch (Exception e) {
			log.error(" Can't find enclosing Agent for age tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for age tag ");
		}
	}

	public void setAge(String age) throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			theAgent.setAge(age);
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for age tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for age tag ");
		}
	}
}

