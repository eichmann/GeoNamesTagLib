package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleWorkplaceHomepageInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleWorkplaceHomepageInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleWorkplaceHomepageInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticleWorkplaceHomepageInverseIterator theWikipediaArticleWorkplaceHomepageInverseIterator = (WikipediaArticleWorkplaceHomepageInverseIterator)findAncestorWithClass(this, WikipediaArticleWorkplaceHomepageInverseIterator.class);
			pageContext.getOut().print(theWikipediaArticleWorkplaceHomepageInverseIterator.getWorkplaceHomepageInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for workplaceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for workplaceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

