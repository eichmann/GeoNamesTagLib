package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonJabberID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonJabberID currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonJabberID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonJabberIDIterator thePerson = (PersonJabberIDIterator)findAncestorWithClass(this, PersonJabberIDIterator.class);
			pageContext.getOut().print(thePerson.getJabberID());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for jabberID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for jabberID tag ");
		}
		return SKIP_BODY;
	}
}

