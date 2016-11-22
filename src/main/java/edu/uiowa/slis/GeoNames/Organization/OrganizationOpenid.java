package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationOpenid extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationOpenid currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationOpenid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationOpenidIterator theOrganization = (OrganizationOpenidIterator)findAncestorWithClass(this, OrganizationOpenidIterator.class);
			pageContext.getOut().print(theOrganization.getOpenid());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for openid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for openid tag ");
		}
		return SKIP_BODY;
	}
}

