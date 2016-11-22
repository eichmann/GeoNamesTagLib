package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleAccountServiceHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleAccountServiceHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleAccountServiceHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticleAccountServiceHomepageInverseIterator theWikipediaArticleAccountServiceHomepageInverseIterator = (WikipediaArticleAccountServiceHomepageInverseIterator)findAncestorWithClass(this, WikipediaArticleAccountServiceHomepageInverseIterator.class);
			pageContext.getOut().print(theWikipediaArticleAccountServiceHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for accountServiceHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for accountServiceHomepage tag ");
		}
		return SKIP_BODY;
	}
}

