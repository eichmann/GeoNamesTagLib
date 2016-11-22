package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentInterest extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentInterest currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentInterest.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentInterestIterator theAgent = (AgentInterestIterator)findAncestorWithClass(this, AgentInterestIterator.class);
			pageContext.getOut().print(theAgent.getInterest());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for interest tag ");
		}
		return SKIP_BODY;
	}
}

