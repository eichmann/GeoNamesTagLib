package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonBased_near extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonBased_near currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonBased_near.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonBased_nearIterator thePerson = (PersonBased_nearIterator)findAncestorWithClass(this, PersonBased_nearIterator.class);
			pageContext.getOut().print(thePerson.getBased_near());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for based_near tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for based_near tag ");
		}
		return SKIP_BODY;
	}
}

