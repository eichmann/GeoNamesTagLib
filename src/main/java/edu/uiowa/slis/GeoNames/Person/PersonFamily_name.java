package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonFamily_name extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonFamily_name currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonFamily_name.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonFamily_nameIterator thePerson = (PersonFamily_nameIterator)findAncestorWithClass(this, PersonFamily_nameIterator.class);
			pageContext.getOut().print(thePerson.getFamily_name());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for family_name tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for family_name tag ");
		}
		return SKIP_BODY;
	}
}

