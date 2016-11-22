package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonPlan extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonPlan currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonPlan.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonPlanIterator thePerson = (PersonPlanIterator)findAncestorWithClass(this, PersonPlanIterator.class);
			pageContext.getOut().print(thePerson.getPlan());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for plan tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for plan tag ");
		}
		return SKIP_BODY;
	}
}

