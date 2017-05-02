package edu.uiowa.slis.GeoNames.Code;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CodeHistoryNote extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static CodeHistoryNote currentInstance = null;
	private static final Log log = LogFactory.getLog(CodeHistoryNote.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CodeHistoryNoteIterator theCode = (CodeHistoryNoteIterator)findAncestorWithClass(this, CodeHistoryNoteIterator.class);
			pageContext.getOut().print(theCode.getHistoryNote());
		} catch (Exception e) {
			log.error("Can't find enclosing Code for historyNote tag ", e);
			throw new JspTagException("Error: Can't find enclosing Code for historyNote tag ");
		}
		return SKIP_BODY;
	}
}

