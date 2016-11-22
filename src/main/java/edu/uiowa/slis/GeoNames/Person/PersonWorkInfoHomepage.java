package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonWorkInfoHomepage extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonWorkInfoHomepage currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonWorkInfoHomepage.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonWorkInfoHomepageIterator thePerson = (PersonWorkInfoHomepageIterator)findAncestorWithClass(this, PersonWorkInfoHomepageIterator.class);
			pageContext.getOut().print(thePerson.getWorkInfoHomepage());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for workInfoHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for workInfoHomepage tag ");
		}
		return SKIP_BODY;
	}
}

