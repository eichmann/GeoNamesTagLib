package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentTopic_interest extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentTopic_interest currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentTopic_interest.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentTopic_interestIterator theAgent = (AgentTopic_interestIterator)findAncestorWithClass(this, AgentTopic_interestIterator.class);
			pageContext.getOut().print(theAgent.getTopic_interest());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for topic_interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for topic_interest tag ");
		}
		return SKIP_BODY;
	}
}

