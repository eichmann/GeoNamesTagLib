package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountTopic_interestInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountTopic_interestInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountTopic_interestInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountTopic_interestInverseIterator theOnlineChatAccountTopic_interestInverseIterator = (OnlineChatAccountTopic_interestInverseIterator)findAncestorWithClass(this, OnlineChatAccountTopic_interestInverseIterator.class);
			pageContext.getOut().print(theOnlineChatAccountTopic_interestInverseIterator.getTopic_interestInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for topic_interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for topic_interest tag ");
		}
		return SKIP_BODY;
	}
}

