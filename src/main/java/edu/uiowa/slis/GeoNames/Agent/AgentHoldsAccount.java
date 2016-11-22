package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentHoldsAccount extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentHoldsAccount currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentHoldsAccount.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentHoldsAccountIterator theAgent = (AgentHoldsAccountIterator)findAncestorWithClass(this, AgentHoldsAccountIterator.class);
			pageContext.getOut().print(theAgent.getHoldsAccount());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for holdsAccount tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for holdsAccount tag ");
		}
		return SKIP_BODY;
	}
}

