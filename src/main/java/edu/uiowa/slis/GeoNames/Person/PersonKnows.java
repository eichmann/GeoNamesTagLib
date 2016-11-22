package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonKnows extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonKnows currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonKnows.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonKnowsIterator thePerson = (PersonKnowsIterator)findAncestorWithClass(this, PersonKnowsIterator.class);
			pageContext.getOut().print(thePerson.getKnows());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for knows tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for knows tag ");
		}
		return SKIP_BODY;
	}
}

