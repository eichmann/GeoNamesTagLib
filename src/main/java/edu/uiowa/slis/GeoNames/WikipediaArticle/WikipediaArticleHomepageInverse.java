package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticleHomepageInverseIterator theWikipediaArticleHomepageInverseIterator = (WikipediaArticleHomepageInverseIterator)findAncestorWithClass(this, WikipediaArticleHomepageInverseIterator.class);
			pageContext.getOut().print(theWikipediaArticleHomepageInverseIterator.getHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for homepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for homepage tag ");
		}
		return SKIP_BODY;
	}
}

