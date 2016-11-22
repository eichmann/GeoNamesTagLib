package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentWeblog extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentWeblog currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentWeblog.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentWeblogIterator theAgent = (AgentWeblogIterator)findAncestorWithClass(this, AgentWeblogIterator.class);
			pageContext.getOut().print(theAgent.getWeblog());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for weblog tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for weblog tag ");
		}
		return SKIP_BODY;
	}
}

