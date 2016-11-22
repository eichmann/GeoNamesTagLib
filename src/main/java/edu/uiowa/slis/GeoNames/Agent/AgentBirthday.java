package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentBirthday extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentBirthday currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentBirthday.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			if (!theAgent.commitNeeded) {
				pageContext.getOut().print(theAgent.getBirthday());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for birthday tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for birthday tag ");
		}
		return SKIP_BODY;
	}

	public String getBirthday() throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			return theAgent.getBirthday();
		} catch (Exception e) {
			log.error(" Can't find enclosing Agent for birthday tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for birthday tag ");
		}
	}

	public void setBirthday(String birthday) throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			theAgent.setBirthday(birthday);
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for birthday tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for birthday tag ");
		}
	}
}

