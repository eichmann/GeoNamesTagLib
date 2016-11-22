package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonSurname extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonSurname currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonSurname.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonSurnameIterator thePerson = (PersonSurnameIterator)findAncestorWithClass(this, PersonSurnameIterator.class);
			pageContext.getOut().print(thePerson.getSurname());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for surname tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for surname tag ");
		}
		return SKIP_BODY;
	}
}

