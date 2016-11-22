package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonStatus extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonStatus.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonStatusIterator thePerson = (PersonStatusIterator)findAncestorWithClass(this, PersonStatusIterator.class);
			pageContext.getOut().print(thePerson.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for status tag ");
		}
		return SKIP_BODY;
	}
}

