package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonGender extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonGender currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonGender.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			if (!thePerson.commitNeeded) {
				pageContext.getOut().print(thePerson.getGender());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Person for gender tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for gender tag ");
		}
		return SKIP_BODY;
	}

	public String getGender() throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			return thePerson.getGender();
		} catch (Exception e) {
			log.error(" Can't find enclosing Person for gender tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for gender tag ");
		}
	}

	public void setGender(String gender) throws JspTagException {
		try {
			Person thePerson = (Person)findAncestorWithClass(this, Person.class);
			thePerson.setGender(gender);
		} catch (Exception e) {
			log.error("Can't find enclosing Person for gender tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for gender tag ");
		}
	}
}

