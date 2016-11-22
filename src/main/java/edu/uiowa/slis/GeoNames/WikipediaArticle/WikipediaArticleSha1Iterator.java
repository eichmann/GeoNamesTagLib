package edu.uiowa.slis.GeoNames.WikipediaArticle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class WikipediaArticleSha1Iterator extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static WikipediaArticleSha1Iterator currentInstance = null;
	private static final Log log = LogFactory.getLog(WikipediaArticleSha1Iterator.class);

	String subjectURI = null;
	String sha1 = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			WikipediaArticle ancestorInstance = (WikipediaArticle) findAncestorWithClass(this, WikipediaArticle.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/sha1> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				sha1 = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in WikipediaArticleIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in WikipediaArticleIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				sha1 = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in WikipediaArticleIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in WikipediaArticleIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in WikipediaArticle doEndTag", e);
			throw new JspTagException("Exception raised in WikipediaArticle doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSha1(String sha1) {
		this.sha1 = sha1;
	}

	public String getSha1() {
		return sha1;
	}

}
