package edu.uiowa.slis.GeoNames.OrderedCollection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrderedCollectionSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OrderedCollectionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OrderedCollectionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OrderedCollection theOrderedCollection = (OrderedCollection)findAncestorWithClass(this, OrderedCollection.class);
			if (!theOrderedCollection.commitNeeded) {
				pageContext.getOut().print(theOrderedCollection.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OrderedCollection for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrderedCollection for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OrderedCollection theOrderedCollection = (OrderedCollection)findAncestorWithClass(this, OrderedCollection.class);
			return theOrderedCollection.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OrderedCollection for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrderedCollection for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OrderedCollection theOrderedCollection = (OrderedCollection)findAncestorWithClass(this, OrderedCollection.class);
			theOrderedCollection.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OrderedCollection for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrderedCollection for subjectURI tag ");
		}
	}
}

