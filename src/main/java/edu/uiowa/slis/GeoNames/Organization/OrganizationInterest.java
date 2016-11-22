package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationInterest extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationInterest currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationInterest.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationInterestIterator theOrganization = (OrganizationInterestIterator)findAncestorWithClass(this, OrganizationInterestIterator.class);
			pageContext.getOut().print(theOrganization.getInterest());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for interest tag ");
		}
		return SKIP_BODY;
	}
}

