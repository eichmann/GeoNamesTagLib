package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonBirthday extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonBirthday currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonBirthday.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			if (!thePerson.commitNeeded) {
				pageContext.getOut().print(thePerson.getBirthday());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Person for birthday tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for birthday tag ");
		}
		return SKIP_BODY;
	}

	public String getBirthday() throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			return thePerson.getBirthday();
		} catch (Exception e) {
			log.error(" Can't find enclosing Person for birthday tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for birthday tag ");
		}
	}

	public void setBirthday(String birthday) throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			thePerson.setBirthday(birthday);
		} catch (Exception e) {
			log.error("Can't find enclosing Person for birthday tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for birthday tag ");
		}
	}
}

