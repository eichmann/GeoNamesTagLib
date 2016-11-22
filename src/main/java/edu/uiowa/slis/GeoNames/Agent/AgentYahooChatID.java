package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentYahooChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentYahooChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentYahooChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentYahooChatIDIterator theAgent = (AgentYahooChatIDIterator)findAncestorWithClass(this, AgentYahooChatIDIterator.class);
			pageContext.getOut().print(theAgent.getYahooChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for yahooChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for yahooChatID tag ");
		}
		return SKIP_BODY;
	}
}

