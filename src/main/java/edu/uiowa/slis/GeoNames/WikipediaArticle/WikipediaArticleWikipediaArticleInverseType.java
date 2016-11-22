package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleWikipediaArticleInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleWikipediaArticleInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleWikipediaArticleInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticleWikipediaArticleInverseIterator theWikipediaArticleWikipediaArticleInverseIterator = (WikipediaArticleWikipediaArticleInverseIterator)findAncestorWithClass(this, WikipediaArticleWikipediaArticleInverseIterator.class);
			pageContext.getOut().print(theWikipediaArticleWikipediaArticleInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for wikipediaArticle tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for wikipediaArticle tag ");
		}
		return SKIP_BODY;
	}
}

