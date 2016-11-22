package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentMade extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentMade currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentMade.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentMadeIterator theAgent = (AgentMadeIterator)findAncestorWithClass(this, AgentMadeIterator.class);
			pageContext.getOut().print(theAgent.getMade());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for made tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for made tag ");
		}
		return SKIP_BODY;
	}
}

