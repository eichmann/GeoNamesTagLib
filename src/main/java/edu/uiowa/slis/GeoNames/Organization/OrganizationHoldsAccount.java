package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationHoldsAccount extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationHoldsAccount currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationHoldsAccount.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationHoldsAccountIterator theOrganization = (OrganizationHoldsAccountIterator)findAncestorWithClass(this, OrganizationHoldsAccountIterator.class);
			pageContext.getOut().print(theOrganization.getHoldsAccount());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for holdsAccount tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for holdsAccount tag ");
		}
		return SKIP_BODY;
	}
}

