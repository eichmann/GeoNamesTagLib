package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentMbox_sha1sum extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentMbox_sha1sum currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentMbox_sha1sum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentMbox_sha1sumIterator theAgent = (AgentMbox_sha1sumIterator)findAncestorWithClass(this, AgentMbox_sha1sumIterator.class);
			pageContext.getOut().print(theAgent.getMbox_sha1sum());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for mbox_sha1sum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for mbox_sha1sum tag ");
		}
		return SKIP_BODY;
	}
}

