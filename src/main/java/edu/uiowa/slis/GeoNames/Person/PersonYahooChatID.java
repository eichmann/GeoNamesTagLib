package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonYahooChatID extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonYahooChatID currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonYahooChatID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonYahooChatIDIterator thePerson = (PersonYahooChatIDIterator)findAncestorWithClass(this, PersonYahooChatIDIterator.class);
			pageContext.getOut().print(thePerson.getYahooChatID());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for yahooChatID tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for yahooChatID tag ");
		}
		return SKIP_BODY;
	}
}

