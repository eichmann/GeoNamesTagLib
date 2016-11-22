package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AgentOpenid extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static AgentOpenid currentInstance = null;
	private static final Log log = LogFactory.getLog(AgentOpenid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AgentOpenidIterator theAgent = (AgentOpenidIterator)findAncestorWithClass(this, AgentOpenidIterator.class);
			pageContext.getOut().print(theAgent.getOpenid());
		} catch (Exception e) {
			log.error("Can't find enclosing Agent for openid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Agent for openid tag ");
		}
		return SKIP_BODY;
	}
}

