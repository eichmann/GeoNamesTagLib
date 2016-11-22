package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonMemberInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonMemberInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonMemberInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonMemberInverseIterator thePersonMemberInverseIterator = (PersonMemberInverseIterator)findAncestorWithClass(this, PersonMemberInverseIterator.class);
			pageContext.getOut().print(thePersonMemberInverseIterator.getMemberInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for member tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for member tag ");
		}
		return SKIP_BODY;
	}
}

