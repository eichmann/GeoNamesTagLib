package edu.uiowa.slis.GeoNames.Organization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationTopic_interest extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrganizationTopic_interest currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationTopic_interest.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationTopic_interestIterator theOrganization = (OrganizationTopic_interestIterator)findAncestorWithClass(this, OrganizationTopic_interestIterator.class);
			pageContext.getOut().print(theOrganization.getTopic_interest());
		} catch (Exception e) {
			log.error("Can't find enclosing Organization for topic_interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organization for topic_interest tag ");
		}
		return SKIP_BODY;
	}
}

