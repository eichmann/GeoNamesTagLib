package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonMyersBriggs extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonMyersBriggs currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonMyersBriggs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonMyersBriggsIterator thePerson = (PersonMyersBriggsIterator)findAncestorWithClass(this, PersonMyersBriggsIterator.class);
			pageContext.getOut().print(thePerson.getMyersBriggs());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for myersBriggs tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for myersBriggs tag ");
		}
		return SKIP_BODY;
	}
}

