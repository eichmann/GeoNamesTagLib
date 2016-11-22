package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonWorkplaceHomepage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonWorkplaceHomepage currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonWorkplaceHomepage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonWorkplaceHomepageIterator thePerson = (PersonWorkplaceHomepageIterator)findAncestorWithClass(this, PersonWorkplaceHomepageIterator.class);
			pageContext.getOut().print(thePerson.getWorkplaceHomepage());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for workplaceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for workplaceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

