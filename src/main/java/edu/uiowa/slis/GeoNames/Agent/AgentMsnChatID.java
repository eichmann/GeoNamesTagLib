package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentMsnChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentMsnChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentMsnChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentMsnChatIDIterator theAgent = (AgentMsnChatIDIterator)findAncestorWithClass(this, AgentMsnChatIDIterator.class);
			pageContext.getOut().print(theAgent.getMsnChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for msnChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for msnChatID tag ");
		}
		return SKIP_BODY;
	}
}

