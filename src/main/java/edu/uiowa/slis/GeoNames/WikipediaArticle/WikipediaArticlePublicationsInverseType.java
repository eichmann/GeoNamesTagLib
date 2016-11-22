package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticlePublicationsInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticlePublicationsInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticlePublicationsInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticlePublicationsInverseIterator theWikipediaArticlePublicationsInverseIterator = (WikipediaArticlePublicationsInverseIterator)findAncestorWithClass(this, WikipediaArticlePublicationsInverseIterator.class);
			pageContext.getOut().print(theWikipediaArticlePublicationsInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for publications tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for publications tag ");
		}
		return SKIP_BODY;
	}
}

