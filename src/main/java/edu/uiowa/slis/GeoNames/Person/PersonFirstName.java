package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonFirstName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonFirstName currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonFirstName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonFirstNameIterator thePerson = (PersonFirstNameIterator)findAncestorWithClass(this, PersonFirstNameIterator.class);
			pageContext.getOut().print(thePerson.getFirstName());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for firstName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for firstName tag ");
		}
		return SKIP_BODY;
	}
}

