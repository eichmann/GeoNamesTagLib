package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WikipediaArticleSubjectURI extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			WikipediaArticle theWikipediaArticle = (WikipediaArticle)findAncestorWithClass(this, WikipediaArticle.class);
			if (!theWikipediaArticle.commitNeeded) {
				pageContext.getOut().print(theWikipediaArticle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			WikipediaArticle theWikipediaArticle = (WikipediaArticle)findAncestorWithClass(this, WikipediaArticle.class);
			return theWikipediaArticle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing WikipediaArticle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			WikipediaArticle theWikipediaArticle = (WikipediaArticle)findAncestorWithClass(this, WikipediaArticle.class);
			theWikipediaArticle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing WikipediaArticle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing WikipediaArticle for subjectURI tag ");
		}
	}
}

