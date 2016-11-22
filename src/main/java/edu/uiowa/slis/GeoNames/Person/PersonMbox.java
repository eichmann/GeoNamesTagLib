package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonMbox extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonMbox currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonMbox.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonMboxIterator thePerson = (PersonMboxIterator)findAncestorWithClass(this, PersonMboxIterator.class);
			pageContext.getOut().print(thePerson.getMbox());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for mbox tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for mbox tag ");
		}
		return SKIP_BODY;
	}
}

