package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticlePrimaryTopic extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticlePrimaryTopic currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticlePrimaryTopic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticlePrimaryTopicIterator theWikipediaArticle = (WikipediaArticlePrimaryTopicIterator)findAncestorWithClass(this, WikipediaArticlePrimaryTopicIterator.class);
			pageContext.getOut().print(theWikipediaArticle.getPrimaryTopic());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for primaryTopic tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for primaryTopic tag ");
		}
		return SKIP_BODY;
	}
}

