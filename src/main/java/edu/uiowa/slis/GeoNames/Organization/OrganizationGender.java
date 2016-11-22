package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationGender extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationGender currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationGender.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			if (!theOrganization.commitNeeded) {
				pageContext.getOut().print(theOrganization.getGender());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for gender tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for gender tag ");
		}
		return SKIP_BODY;
	}

	public String getGender() throws JspTagException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			return theOrganization.getGender();
		} catch (Exception e) {
			log.error(" Can't find enclosing Organization for gender tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for gender tag ");
		}
	}

	public void setGender(String gender) throws JspTagException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			theOrganization.setGender(gender);
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for gender tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for gender tag ");
		}
	}
}

