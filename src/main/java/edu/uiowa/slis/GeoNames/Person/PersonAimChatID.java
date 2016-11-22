package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonAimChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonAimChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonAimChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonAimChatIDIterator thePerson = (PersonAimChatIDIterator)findAncestorWithClass(this, PersonAimChatIDIterator.class);
			pageContext.getOut().print(thePerson.getAimChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for aimChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for aimChatID tag ");
		}
		return SKIP_BODY;
	}
}

