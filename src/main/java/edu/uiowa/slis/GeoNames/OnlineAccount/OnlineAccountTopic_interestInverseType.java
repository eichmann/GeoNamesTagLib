package edu.uiowa.slis.GeoNames.OnlineAccount;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OnlineAccountTopic_interestInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static OnlineAccountTopic_interestInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(OnlineAccountTopic_interestInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OnlineAccountTopic_interestInverseIterator theOnlineAccountTopic_interestInverseIterator = (OnlineAccountTopic_interestInverseIterator)findAncestorWithClass(this, OnlineAccountTopic_interestInverseIterator.class);
			pageContext.getOut().print(theOnlineAccountTopic_interestInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing OnlineAccount for topic_interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing OnlineAccount for topic_interest tag ");
		}
		return SKIP_BODY;
	}
}

