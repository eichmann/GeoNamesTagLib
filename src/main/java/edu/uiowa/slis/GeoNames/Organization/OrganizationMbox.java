package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationMbox extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationMbox currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationMbox.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationMboxIterator theOrganization = (OrganizationMboxIterator)findAncestorWithClass(this, OrganizationMboxIterator.class);
			pageContext.getOut().print(theOrganization.getMbox());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for mbox tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for mbox tag ");
		}
		return SKIP_BODY;
	}
}

