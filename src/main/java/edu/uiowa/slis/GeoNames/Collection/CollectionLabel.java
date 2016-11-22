package edu.uiowa.slis.GeoNames.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CollectionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			if (!theCollection.commitNeeded) {
				pageContext.getOut().print(theCollection.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			return theCollection.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Collection for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			theCollection.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for label tag ");
		}
	}
}

