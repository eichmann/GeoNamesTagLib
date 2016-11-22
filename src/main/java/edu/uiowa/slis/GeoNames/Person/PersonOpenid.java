package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonOpenid extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonOpenid currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonOpenid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonOpenidIterator thePerson = (PersonOpenidIterator)findAncestorWithClass(this, PersonOpenidIterator.class);
			pageContext.getOut().print(thePerson.getOpenid());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for openid tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for openid tag ");
		}
		return SKIP_BODY;
	}
}

