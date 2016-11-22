package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonAccount extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonAccount currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonAccount.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonAccountIterator thePerson = (PersonAccountIterator)findAncestorWithClass(this, PersonAccountIterator.class);
			pageContext.getOut().print(thePerson.getAccount());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for account tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for account tag ");
		}
		return SKIP_BODY;
	}
}

