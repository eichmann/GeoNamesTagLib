package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleLabel extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticle theWikipediaArticle = (WikipediaArticle)findAncestorWithClass(this, WikipediaArticle.class);
			if (!theWikipediaArticle.commitNeeded) {
				pageContext.getOut().print(theWikipediaArticle.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			WikipediaArticle theWikipediaArticle = (WikipediaArticle)findAncestorWithClass(this, WikipediaArticle.class);
			return theWikipediaArticle.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing WikipediaArticle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			WikipediaArticle theWikipediaArticle = (WikipediaArticle)findAncestorWithClass(this, WikipediaArticle.class);
			theWikipediaArticle.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for label tag ");
		}
	}
}

