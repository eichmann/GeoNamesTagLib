package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleSha1 extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleSha1 currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleSha1.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticleSha1Iterator theWikipediaArticle = (WikipediaArticleSha1Iterator)findAncestorWithClass(this, WikipediaArticleSha1Iterator.class);
			pageContext.getOut().print(theWikipediaArticle.getSha1());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for sha1 tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for sha1 tag ");
		}
		return SKIP_BODY;
	}
}

