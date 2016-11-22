package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationJabberID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationJabberID currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationJabberID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationJabberIDIterator theOrganization = (OrganizationJabberIDIterator)findAncestorWithClass(this, OrganizationJabberIDIterator.class);
			pageContext.getOut().print(theOrganization.getJabberID());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for jabberID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for jabberID tag ");
		}
		return SKIP_BODY;
	}
}

