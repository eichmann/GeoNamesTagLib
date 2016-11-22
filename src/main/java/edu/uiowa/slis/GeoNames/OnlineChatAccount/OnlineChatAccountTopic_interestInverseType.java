package edu.uiowa.slis.GeoNames.OnlineChatAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineChatAccountTopic_interestInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineChatAccountTopic_interestInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineChatAccountTopic_interestInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineChatAccountTopic_interestInverseIterator theOnlineChatAccountTopic_interestInverseIterator = (OnlineChatAccountTopic_interestInverseIterator)findAncestorWithClass(this, OnlineChatAccountTopic_interestInverseIterator.class);
			pageContext.getOut().print(theOnlineChatAccountTopic_interestInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineChatAccount for topic_interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineChatAccount for topic_interest tag ");
		}
		return SKIP_BODY;
	}
}

