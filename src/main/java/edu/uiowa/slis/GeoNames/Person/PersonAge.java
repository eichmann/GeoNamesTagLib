package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonAge extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonAge currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonAge.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			if (!thePerson.commitNeeded) {
				pageContext.getOut().print(thePerson.getAge());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Person for age tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for age tag ");
		}
		return SKIP_BODY;
	}

	public String getAge() throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			return thePerson.getAge();
		} catch (Exception e) {
			log.error(" Can't find enclosing Person for age tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for age tag ");
		}
	}

	public void setAge(String age) throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			thePerson.setAge(age);
		} catch (Exception e) {
			log.error("Can't find enclosing Person for age tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for age tag ");
		}
	}
}

