package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAimChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentAimChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAimChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentAimChatIDIterator theAgent = (AgentAimChatIDIterator)findAncestorWithClass(this, AgentAimChatIDIterator.class);
			pageContext.getOut().print(theAgent.getAimChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for aimChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for aimChatID tag ");
		}
		return SKIP_BODY;
	}
}

