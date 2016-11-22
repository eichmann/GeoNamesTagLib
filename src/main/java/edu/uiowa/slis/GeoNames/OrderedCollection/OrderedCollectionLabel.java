package edu.uiowa.slis.GeoNames.OrderedCollection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrderedCollectionLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrderedCollectionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(OrderedCollectionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OrderedCollection theOrderedCollection = (OrderedCollection)findAncestorWithClass(this, OrderedCollection.class);
			if (!theOrderedCollection.commitNeeded) {
				pageContext.getOut().print(theOrderedCollection.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OrderedCollection for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrderedCollection for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			OrderedCollection theOrderedCollection = (OrderedCollection)findAncestorWithClass(this, OrderedCollection.class);
			return theOrderedCollection.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing OrderedCollection for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrderedCollection for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			OrderedCollection theOrderedCollection = (OrderedCollection)findAncestorWithClass(this, OrderedCollection.class);
			theOrderedCollection.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing OrderedCollection for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrderedCollection for label tag ");
		}
	}
}

