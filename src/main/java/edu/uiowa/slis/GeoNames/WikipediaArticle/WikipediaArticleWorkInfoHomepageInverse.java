package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleWorkInfoHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleWorkInfoHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleWorkInfoHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticleWorkInfoHomepageInverseIterator theWikipediaArticleWorkInfoHomepageInverseIterator = (WikipediaArticleWorkInfoHomepageInverseIterator)findAncestorWithClass(this, WikipediaArticleWorkInfoHomepageInverseIterator.class);
			pageContext.getOut().print(theWikipediaArticleWorkInfoHomepageInverseIterator.getWorkInfoHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for workInfoHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for workInfoHomepage tag ");
		}
		return SKIP_BODY;
	}
}

