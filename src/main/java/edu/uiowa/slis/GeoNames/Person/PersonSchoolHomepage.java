package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonSchoolHomepage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonSchoolHomepage currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonSchoolHomepage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonSchoolHomepageIterator thePerson = (PersonSchoolHomepageIterator)findAncestorWithClass(this, PersonSchoolHomepageIterator.class);
			pageContext.getOut().print(thePerson.getSchoolHomepage());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for schoolHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for schoolHomepage tag ");
		}
		return SKIP_BODY;
	}
}

