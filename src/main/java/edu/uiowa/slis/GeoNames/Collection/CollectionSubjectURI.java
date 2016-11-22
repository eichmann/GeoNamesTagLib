package edu.uiowa.slis.GeoNames.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollectionSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CollectionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(CollectionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			if (!theCollection.commitNeeded) {
				pageContext.getOut().print(theCollection.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			return theCollection.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Collection for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Collection theCollection = (Collection)findAncestorWithClass(this, Collection.class);
			theCollection.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Collection for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Collection for subjectURI tag ");
		}
	}
}

