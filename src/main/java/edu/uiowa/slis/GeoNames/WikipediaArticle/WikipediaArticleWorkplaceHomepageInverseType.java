package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleWorkplaceHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleWorkplaceHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleWorkplaceHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticleWorkplaceHomepageInverseIterator theWikipediaArticleWorkplaceHomepageInverseIterator = (WikipediaArticleWorkplaceHomepageInverseIterator)findAncestorWithClass(this, WikipediaArticleWorkplaceHomepageInverseIterator.class);
			pageContext.getOut().print(theWikipediaArticleWorkplaceHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for workplaceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for workplaceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

