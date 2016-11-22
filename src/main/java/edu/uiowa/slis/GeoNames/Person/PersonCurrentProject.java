package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonCurrentProject extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonCurrentProject currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonCurrentProject.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonCurrentProjectIterator thePerson = (PersonCurrentProjectIterator)findAncestorWithClass(this, PersonCurrentProjectIterator.class);
			pageContext.getOut().print(thePerson.getCurrentProject());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for currentProject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for currentProject tag ");
		}
		return SKIP_BODY;
	}
}

