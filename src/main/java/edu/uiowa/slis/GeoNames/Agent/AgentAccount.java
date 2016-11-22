package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentAccount extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentAccount currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentAccount.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentAccountIterator theAgent = (AgentAccountIterator)findAncestorWithClass(this, AgentAccountIterator.class);
			pageContext.getOut().print(theAgent.getAccount());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for account tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for account tag ");
		}
		return SKIP_BODY;
	}
}

