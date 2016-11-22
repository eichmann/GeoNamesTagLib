package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentStatus extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentStatus.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentStatusIterator theAgent = (AgentStatusIterator)findAncestorWithClass(this, AgentStatusIterator.class);
			pageContext.getOut().print(theAgent.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for status tag ");
		}
		return SKIP_BODY;
	}
}

