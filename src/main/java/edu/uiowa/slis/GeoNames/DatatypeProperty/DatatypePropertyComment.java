package edu.uiowa.slis.GeoNames.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyComment extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static DatatypePropertyComment currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyComment.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyCommentIterator theDatatypeProperty = (DatatypePropertyCommentIterator)findAncestorWithClass(this, DatatypePropertyCommentIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getComment());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for comment tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for comment tag ");
		}
		return SKIP_BODY;
	}
}

