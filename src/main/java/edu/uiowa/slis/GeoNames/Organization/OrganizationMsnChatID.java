package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationMsnChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationMsnChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationMsnChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationMsnChatIDIterator theOrganization = (OrganizationMsnChatIDIterator)findAncestorWithClass(this, OrganizationMsnChatIDIterator.class);
			pageContext.getOut().print(theOrganization.getMsnChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for msnChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for msnChatID tag ");
		}
		return SKIP_BODY;
	}
}

