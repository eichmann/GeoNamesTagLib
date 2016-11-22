package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentMemberInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AgentMemberInverseIterator theAgentMemberInverseIterator = (AgentMemberInverseIterator)findAncestorWithClass(this, AgentMemberInverseIterator.class);
			pageContext.getOut().print(theAgentMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for member tag ");
		}
		return SKIP_BODY;
	}
}

