package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FeatureWikipediaArticleType extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static FeatureWikipediaArticleType currentInstance = null;
	private static final Log log = LogFactory.getLog(FeatureWikipediaArticleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FeatureWikipediaArticleIterator theFeatureWikipediaArticleIterator = (FeatureWikipediaArticleIterator)findAncestorWithClass(this, FeatureWikipediaArticleIterator.class);
			pageContext.getOut().print(theFeatureWikipediaArticleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Feature for wikipediaArticle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Feature for wikipediaArticle tag ");
		}
		return SKIP_BODY;
	}
}

