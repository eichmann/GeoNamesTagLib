package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonMbox_sha1sum extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonMbox_sha1sum currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonMbox_sha1sum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonMbox_sha1sumIterator thePerson = (PersonMbox_sha1sumIterator)findAncestorWithClass(this, PersonMbox_sha1sumIterator.class);
			pageContext.getOut().print(thePerson.getMbox_sha1sum());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for mbox_sha1sum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for mbox_sha1sum tag ");
		}
		return SKIP_BODY;
	}
}

