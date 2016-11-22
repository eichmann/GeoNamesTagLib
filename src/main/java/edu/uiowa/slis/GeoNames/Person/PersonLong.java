package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonLong extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonLong currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonLong.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonLongIterator thePerson = (PersonLongIterator)findAncestorWithClass(this, PersonLongIterator.class);
			pageContext.getOut().print(thePerson.getLong());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for long tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for long tag ");
		}
		return SKIP_BODY;
	}
}

