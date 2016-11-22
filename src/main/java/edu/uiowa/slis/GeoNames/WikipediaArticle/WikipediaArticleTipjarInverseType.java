package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleTipjarInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleTipjarInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleTipjarInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticleTipjarInverseIterator theWikipediaArticleTipjarInverseIterator = (WikipediaArticleTipjarInverseIterator)findAncestorWithClass(this, WikipediaArticleTipjarInverseIterator.class);
			pageContext.getOut().print(theWikipediaArticleTipjarInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for tipjar tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for tipjar tag ");
		}
		return SKIP_BODY;
	}
}

