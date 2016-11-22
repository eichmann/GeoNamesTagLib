package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentSkypeID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentSkypeID currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentSkypeID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentSkypeIDIterator theAgent = (AgentSkypeIDIterator)findAncestorWithClass(this, AgentSkypeIDIterator.class);
			pageContext.getOut().print(theAgent.getSkypeID());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for skypeID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for skypeID tag ");
		}
		return SKIP_BODY;
	}
}

