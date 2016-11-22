package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentMbox extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentMbox currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentMbox.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentMboxIterator theAgent = (AgentMboxIterator)findAncestorWithClass(this, AgentMboxIterator.class);
			pageContext.getOut().print(theAgent.getMbox());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for mbox tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for mbox tag ");
		}
		return SKIP_BODY;
	}
}

