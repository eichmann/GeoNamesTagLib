package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonMsnChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonMsnChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonMsnChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonMsnChatIDIterator thePerson = (PersonMsnChatIDIterator)findAncestorWithClass(this, PersonMsnChatIDIterator.class);
			pageContext.getOut().print(thePerson.getMsnChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for msnChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for msnChatID tag ");
		}
		return SKIP_BODY;
	}
}

