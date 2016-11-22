package edu.uiowa.slis.GeoNames.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MapLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static MapLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(MapLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Map theMap = (Map)findAncestorWithClass(this, Map.class);
			if (!theMap.commitNeeded) {
				pageContext.getOut().print(theMap.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Map for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Map theMap = (Map)findAncestorWithClass(this, Map.class);
			return theMap.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Map for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Map theMap = (Map)findAncestorWithClass(this, Map.class);
			theMap.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Map for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Map for label tag ");
		}
	}
}

