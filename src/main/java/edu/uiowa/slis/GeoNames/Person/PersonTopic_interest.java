package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonTopic_interest extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static PersonTopic_interest currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonTopic_interest.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonTopic_interestIterator thePerson = (PersonTopic_interestIterator)findAncestorWithClass(this, PersonTopic_interestIterator.class);
			pageContext.getOut().print(thePerson.getTopic_interest());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for topic_interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for topic_interest tag ");
		}
		return SKIP_BODY;
	}
}

