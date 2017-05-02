package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureWikipediaArticle extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureWikipediaArticle currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureWikipediaArticle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureWikipediaArticleIterator theFeatureWikipediaArticleIterator = (FeatureWikipediaArticleIterator)findAncestorWithClass(this, FeatureWikipediaArticleIterator.class);
			pageContext.getOut().print(theFeatureWikipediaArticleIterator.getWikipediaArticle());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for wikipediaArticle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for wikipediaArticle tag ");
		}
		return SKIP_BODY;
	}
}

