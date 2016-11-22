package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeonamesFeatureWikipediaArticle extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureWikipediaArticle currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureWikipediaArticle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeonamesFeatureWikipediaArticleIterator theGeonamesFeature = (GeonamesFeatureWikipediaArticleIterator)findAncestorWithClass(this, GeonamesFeatureWikipediaArticleIterator.class);
			pageContext.getOut().print(theGeonamesFeature.getWikipediaArticle());
		} catch (Exception e) {
			log.error("Can't find enclosing GeonamesFeature for wikipediaArticle tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeonamesFeature for wikipediaArticle tag ");
		}
		return SKIP_BODY;
	}
}

