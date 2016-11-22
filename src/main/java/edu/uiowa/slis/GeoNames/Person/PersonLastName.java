package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonLastName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonLastName currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonLastName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonLastNameIterator thePerson = (PersonLastNameIterator)findAncestorWithClass(this, PersonLastNameIterator.class);
			pageContext.getOut().print(thePerson.getLastName());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for lastName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for lastName tag ");
		}
		return SKIP_BODY;
	}
}

