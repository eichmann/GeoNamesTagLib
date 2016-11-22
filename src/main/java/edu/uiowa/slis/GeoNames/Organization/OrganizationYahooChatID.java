package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationYahooChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationYahooChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationYahooChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationYahooChatIDIterator theOrganization = (OrganizationYahooChatIDIterator)findAncestorWithClass(this, OrganizationYahooChatIDIterator.class);
			pageContext.getOut().print(theOrganization.getYahooChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for yahooChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for yahooChatID tag ");
		}
		return SKIP_BODY;
	}
}

