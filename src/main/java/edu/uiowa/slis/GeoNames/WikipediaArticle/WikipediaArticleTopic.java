package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleTopic extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleTopic currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleTopic.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticleTopicIterator theWikipediaArticle = (WikipediaArticleTopicIterator)findAncestorWithClass(this, WikipediaArticleTopicIterator.class);
			pageContext.getOut().print(theWikipediaArticle.getTopic());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for topic tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for topic tag ");
		}
		return SKIP_BODY;
	}
}

