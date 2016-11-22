package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonFamilyName extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonFamilyName currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonFamilyName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonFamilyNameIterator thePerson = (PersonFamilyNameIterator)findAncestorWithClass(this, PersonFamilyNameIterator.class);
			pageContext.getOut().print(thePerson.getFamilyName());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for familyName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for familyName tag ");
		}
		return SKIP_BODY;
	}
}

