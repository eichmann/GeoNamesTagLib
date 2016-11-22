package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationTipjar extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationTipjar currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationTipjar.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationTipjarIterator theOrganization = (OrganizationTipjarIterator)findAncestorWithClass(this, OrganizationTipjarIterator.class);
			pageContext.getOut().print(theOrganization.getTipjar());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for tipjar tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for tipjar tag ");
		}
		return SKIP_BODY;
	}
}

