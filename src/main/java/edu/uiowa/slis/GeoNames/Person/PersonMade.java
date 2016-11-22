package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonMade extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonMade currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonMade.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonMadeIterator thePerson = (PersonMadeIterator)findAncestorWithClass(this, PersonMadeIterator.class);
			pageContext.getOut().print(thePerson.getMade());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for made tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for made tag ");
		}
		return SKIP_BODY;
	}
}

