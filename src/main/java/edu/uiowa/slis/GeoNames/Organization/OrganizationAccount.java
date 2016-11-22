package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationAccount extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationAccount currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationAccount.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationAccountIterator theOrganization = (OrganizationAccountIterator)findAncestorWithClass(this, OrganizationAccountIterator.class);
			pageContext.getOut().print(theOrganization.getAccount());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for account tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for account tag ");
		}
		return SKIP_BODY;
	}
}

