package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleSchoolHomepageInverseType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleSchoolHomepageInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleSchoolHomepageInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticleSchoolHomepageInverseIterator theWikipediaArticleSchoolHomepageInverseIterator = (WikipediaArticleSchoolHomepageInverseIterator)findAncestorWithClass(this, WikipediaArticleSchoolHomepageInverseIterator.class);
			pageContext.getOut().print(theWikipediaArticleSchoolHomepageInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for schoolHomepage tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for schoolHomepage tag ");
		}
		return SKIP_BODY;
	}
}

