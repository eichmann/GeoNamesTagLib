package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleInterestInverse extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleInterestInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleInterestInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticleInterestInverseIterator theWikipediaArticleInterestInverseIterator = (WikipediaArticleInterestInverseIterator)findAncestorWithClass(this, WikipediaArticleInterestInverseIterator.class);
			pageContext.getOut().print(theWikipediaArticleInterestInverseIterator.getInterestInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for interest tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for interest tag ");
		}
		return SKIP_BODY;
	}
}

