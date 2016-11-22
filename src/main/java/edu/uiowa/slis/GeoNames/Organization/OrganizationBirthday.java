package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationBirthday extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationBirthday currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationBirthday.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			if (!theOrganization.commitNeeded) {
				pageContext.getOut().print(theOrganization.getBirthday());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for birthday tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for birthday tag ");
		}
		return SKIP_BODY;
	}

	public String getBirthday() throws JspTagException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			return theOrganization.getBirthday();
		} catch (Exception e) {
			log.error(" Can't find enclosing Organization for birthday tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for birthday tag ");
		}
	}

	public void setBirthday(String birthday) throws JspTagException {
		try {
			Organization theOrganization = (Organization)findAncestorWithClass(this, Organization.class);
			theOrganization.setBirthday(birthday);
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for birthday tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for birthday tag ");
		}
	}
}

