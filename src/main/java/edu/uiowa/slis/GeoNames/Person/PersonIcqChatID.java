package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonIcqChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonIcqChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonIcqChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonIcqChatIDIterator thePerson = (PersonIcqChatIDIterator)findAncestorWithClass(this, PersonIcqChatIDIterator.class);
			pageContext.getOut().print(thePerson.getIcqChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for icqChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for icqChatID tag ");
		}
		return SKIP_BODY;
	}
}

