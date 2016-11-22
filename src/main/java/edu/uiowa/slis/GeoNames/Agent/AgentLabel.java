package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			if (!theAgent.commitNeeded) {
				pageContext.getOut().print(theAgent.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			return theAgent.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Agent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Agent theAgent = (Agent)findAncestorWithClass(this, Agent.class);
			theAgent.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for label tag ");
		}
	}
}

