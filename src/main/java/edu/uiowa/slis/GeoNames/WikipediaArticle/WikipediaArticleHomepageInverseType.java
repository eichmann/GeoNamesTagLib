package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticleHomepageInverseIterator theWikipediaArticleHomepageInverseIterator = (WikipediaArticleHomepageInverseIterator)findAncestorWithClass(this, WikipediaArticleHomepageInverseIterator.class);
			pageContext.getOut().print(theWikipediaArticleHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for homepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for homepage tag ");
		}
		return SKIP_BODY;
	}
}

