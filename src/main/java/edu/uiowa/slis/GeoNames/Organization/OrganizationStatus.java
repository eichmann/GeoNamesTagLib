package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationStatus extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationStatus.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationStatusIterator theOrganization = (OrganizationStatusIterator)findAncestorWithClass(this, OrganizationStatusIterator.class);
			pageContext.getOut().print(theOrganization.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for status tag ");
		}
		return SKIP_BODY;
	}
}

