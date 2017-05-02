package edu.uiowa.slis.GeoNames.TransitiveProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TransitivePropertyTheType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static TransitivePropertyTheType currentInstance = null;
	private static final Log log = LogFactory.getLog(TransitivePropertyTheType.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			TransitivePropertyTheTypeIterator theTransitiveProperty = (TransitivePropertyTheTypeIterator)findAncestorWithClass(this, TransitivePropertyTheTypeIterator.class);
			pageContext.getOut().print(theTransitiveProperty.getTheType());
		} catch (Exception e) {
			log.error("Can't find enclosing TransitiveProperty for theType tag ", e);
			throw new JspTagException("Error: Can't find enclosing TransitiveProperty for theType tag ");
		}
		return SKIP_BODY;
	}
}

