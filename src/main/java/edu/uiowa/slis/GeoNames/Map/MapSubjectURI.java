package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MapSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Map theMap = (Map)findAncestorWithClass(this, Map.class);
			if (!theMap.commitNeeded) {
				pageContext.getOut().print(theMap.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Map for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Map theMap = (Map)findAncestorWithClass(this, Map.class);
			return theMap.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Map for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Map theMap = (Map)findAncestorWithClass(this, Map.class);
			theMap.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Map for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for subjectURI tag ");
		}
	}
}

