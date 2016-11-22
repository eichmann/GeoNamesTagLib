package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonPublications extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonPublications currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonPublications.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonPublicationsIterator thePerson = (PersonPublicationsIterator)findAncestorWithClass(this, PersonPublicationsIterator.class);
			pageContext.getOut().print(thePerson.getPublications());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for publications tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for publications tag ");
		}
		return SKIP_BODY;
	}
}

