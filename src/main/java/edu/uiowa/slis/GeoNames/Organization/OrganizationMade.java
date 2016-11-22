package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationMade extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationMade currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationMade.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationMadeIterator theOrganization = (OrganizationMadeIterator)findAncestorWithClass(this, OrganizationMadeIterator.class);
			pageContext.getOut().print(theOrganization.getMade());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for made tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for made tag ");
		}
		return SKIP_BODY;
	}
}

