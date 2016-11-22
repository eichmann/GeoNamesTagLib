package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationMemberInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationMemberInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationMemberInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OrganizationMemberInverseIterator theOrganizationMemberInverseIterator = (OrganizationMemberInverseIterator)findAncestorWithClass(this, OrganizationMemberInverseIterator.class);
			pageContext.getOut().print(theOrganizationMemberInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for member tag ");
		}
		return SKIP_BODY;
	}
}

