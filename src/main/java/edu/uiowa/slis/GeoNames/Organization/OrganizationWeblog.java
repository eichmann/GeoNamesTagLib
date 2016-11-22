package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationWeblog extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationWeblog currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationWeblog.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationWeblogIterator theOrganization = (OrganizationWeblogIterator)findAncestorWithClass(this, OrganizationWeblogIterator.class);
			pageContext.getOut().print(theOrganization.getWeblog());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for weblog tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for weblog tag ");
		}
		return SKIP_BODY;
	}
}

