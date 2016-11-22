package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonPastProject extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonPastProject currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonPastProject.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonPastProjectIterator thePerson = (PersonPastProjectIterator)findAncestorWithClass(this, PersonPastProjectIterator.class);
			pageContext.getOut().print(thePerson.getPastProject());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for pastProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for pastProject tag ");
		}
		return SKIP_BODY;
	}
}

