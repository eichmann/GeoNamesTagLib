package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationSkypeID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationSkypeID currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationSkypeID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationSkypeIDIterator theOrganization = (OrganizationSkypeIDIterator)findAncestorWithClass(this, OrganizationSkypeIDIterator.class);
			pageContext.getOut().print(theOrganization.getSkypeID());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for skypeID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for skypeID tag ");
		}
		return SKIP_BODY;
	}
}

