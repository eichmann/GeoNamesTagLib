package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonTipjar extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonTipjar currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonTipjar.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonTipjarIterator thePerson = (PersonTipjarIterator)findAncestorWithClass(this, PersonTipjarIterator.class);
			pageContext.getOut().print(thePerson.getTipjar());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for tipjar tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for tipjar tag ");
		}
		return SKIP_BODY;
	}
}

