package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonImg extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonImg currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonImg.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonImgIterator thePerson = (PersonImgIterator)findAncestorWithClass(this, PersonImgIterator.class);
			pageContext.getOut().print(thePerson.getImg());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for img tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for img tag ");
		}
		return SKIP_BODY;
	}
}

