package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationIcqChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationIcqChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationIcqChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationIcqChatIDIterator theOrganization = (OrganizationIcqChatIDIterator)findAncestorWithClass(this, OrganizationIcqChatIDIterator.class);
			pageContext.getOut().print(theOrganization.getIcqChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for icqChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for icqChatID tag ");
		}
		return SKIP_BODY;
	}
}

