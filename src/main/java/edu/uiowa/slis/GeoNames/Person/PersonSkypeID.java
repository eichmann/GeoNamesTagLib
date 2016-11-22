package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonSkypeID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonSkypeID currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonSkypeID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonSkypeIDIterator thePerson = (PersonSkypeIDIterator)findAncestorWithClass(this, PersonSkypeIDIterator.class);
			pageContext.getOut().print(thePerson.getSkypeID());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for skypeID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for skypeID tag ");
		}
		return SKIP_BODY;
	}
}

