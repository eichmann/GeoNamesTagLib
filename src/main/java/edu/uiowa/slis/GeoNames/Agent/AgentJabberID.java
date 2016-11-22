package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentJabberID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentJabberID currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentJabberID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentJabberIDIterator theAgent = (AgentJabberIDIterator)findAncestorWithClass(this, AgentJabberIDIterator.class);
			pageContext.getOut().print(theAgent.getJabberID());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for jabberID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for jabberID tag ");
		}
		return SKIP_BODY;
	}
}

