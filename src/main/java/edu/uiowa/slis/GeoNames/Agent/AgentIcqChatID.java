package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentIcqChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentIcqChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentIcqChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentIcqChatIDIterator theAgent = (AgentIcqChatIDIterator)findAncestorWithClass(this, AgentIcqChatIDIterator.class);
			pageContext.getOut().print(theAgent.getIcqChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for icqChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for icqChatID tag ");
		}
		return SKIP_BODY;
	}
}

