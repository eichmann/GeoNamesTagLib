package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleOpenidInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleOpenidInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleOpenidInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticleOpenidInverseIterator theWikipediaArticleOpenidInverseIterator = (WikipediaArticleOpenidInverseIterator)findAncestorWithClass(this, WikipediaArticleOpenidInverseIterator.class);
			pageContext.getOut().print(theWikipediaArticleOpenidInverseIterator.getOpenidInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for openid tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for openid tag ");
		}
		return SKIP_BODY;
	}
}

