package edu.uiowa.slis.GeoNames.Nothing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NothingIsPrimaryTopicOf extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static NothingIsPrimaryTopicOf currentInstance = null;
	private static final Log log = LogFactory.getLog(NothingIsPrimaryTopicOf.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NothingIsPrimaryTopicOfIterator theNothing = (NothingIsPrimaryTopicOfIterator)findAncestorWithClass(this, NothingIsPrimaryTopicOfIterator.class);
			pageContext.getOut().print(theNothing.getIsPrimaryTopicOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Nothing for isPrimaryTopicOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Nothing for isPrimaryTopicOf tag ");
		}
		return SKIP_BODY;
	}
}

