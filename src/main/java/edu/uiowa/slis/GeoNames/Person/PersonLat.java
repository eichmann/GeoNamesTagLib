package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonLat extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonLat currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonLat.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonLatIterator thePerson = (PersonLatIterator)findAncestorWithClass(this, PersonLatIterator.class);
			pageContext.getOut().print(thePerson.getLat());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for lat tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for lat tag ");
		}
		return SKIP_BODY;
	}
}

