package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationAge extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationAge currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationAge.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			if (!theOrganization.commitNeeded) {
				pageContext.getOut().print(theOrganization.getAge());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for age tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for age tag ");
		}
		return SKIP_BODY;
	}

	public String getAge() throws JspTagException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			return theOrganization.getAge();
		} catch (Exception e) {
			log.error(" Can't find enclosing Organization for age tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for age tag ");
		}
	}

	public void setAge(String age) throws JspTagException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			theOrganization.setAge(age);
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for age tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for age tag ");
		}
	}
}

