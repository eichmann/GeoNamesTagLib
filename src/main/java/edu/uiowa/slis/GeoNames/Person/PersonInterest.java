package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonInterest extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonInterest currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonInterest.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonInterestIterator thePerson = (PersonInterestIterator)findAncestorWithClass(this, PersonInterestIterator.class);
			pageContext.getOut().print(thePerson.getInterest());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for interest tag ");
		}
		return SKIP_BODY;
	}
}

