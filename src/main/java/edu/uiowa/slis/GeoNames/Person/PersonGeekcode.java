package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonGeekcode extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonGeekcode currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonGeekcode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonGeekcodeIterator thePerson = (PersonGeekcodeIterator)findAncestorWithClass(this, PersonGeekcodeIterator.class);
			pageContext.getOut().print(thePerson.getGeekcode());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for geekcode tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for geekcode tag ");
		}
		return SKIP_BODY;
	}
}

