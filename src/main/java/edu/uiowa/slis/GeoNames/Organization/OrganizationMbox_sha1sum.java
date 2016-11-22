package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationMbox_sha1sum extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationMbox_sha1sum currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationMbox_sha1sum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationMbox_sha1sumIterator theOrganization = (OrganizationMbox_sha1sumIterator)findAncestorWithClass(this, OrganizationMbox_sha1sumIterator.class);
			pageContext.getOut().print(theOrganization.getMbox_sha1sum());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for mbox_sha1sum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for mbox_sha1sum tag ");
		}
		return SKIP_BODY;
	}
}

