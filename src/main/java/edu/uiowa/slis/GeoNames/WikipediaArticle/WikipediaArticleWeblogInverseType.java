package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleWeblogInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleWeblogInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleWeblogInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticleWeblogInverseIterator theWikipediaArticleWeblogInverseIterator = (WikipediaArticleWeblogInverseIterator)findAncestorWithClass(this, WikipediaArticleWeblogInverseIterator.class);
			pageContext.getOut().print(theWikipediaArticleWeblogInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for weblog tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for weblog tag ");
		}
		return SKIP_BODY;
	}
}

