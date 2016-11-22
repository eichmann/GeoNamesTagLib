package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHoldsAccount extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonHoldsAccount currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHoldsAccount.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonHoldsAccountIterator thePerson = (PersonHoldsAccountIterator)findAncestorWithClass(this, PersonHoldsAccountIterator.class);
			pageContext.getOut().print(thePerson.getHoldsAccount());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for holdsAccount tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for holdsAccount tag ");
		}
		return SKIP_BODY;
	}
}

