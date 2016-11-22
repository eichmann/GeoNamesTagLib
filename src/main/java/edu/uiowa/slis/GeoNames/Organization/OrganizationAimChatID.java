package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationAimChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationAimChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationAimChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationAimChatIDIterator theOrganization = (OrganizationAimChatIDIterator)findAncestorWithClass(this, OrganizationAimChatIDIterator.class);
			pageContext.getOut().print(theOrganization.getAimChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for aimChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for aimChatID tag ");
		}
		return SKIP_BODY;
	}
}

