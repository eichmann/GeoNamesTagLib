package edu.uiowa.slis.GeoNames.GeonamesFeature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class GeonamesFeatureWikipediaArticleIterator extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static GeonamesFeatureWikipediaArticleIterator currentInstance = null;
	private static final Log log = LogFactory.getLog(GeonamesFeatureWikipediaArticleIterator.class);

	String subjectURI = null;
	String wikipediaArticle = null;
	ResultSet rs = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			GeonamesFeature ancestorInstance = (GeonamesFeature) findAncestorWithClass(this, GeonamesFeature.class);

			if (ancestorInstance != null) {
				subjectURI = ancestorInstance.getSubjectURI();
			}

			if (ancestorInstance == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			}

			rs = getResultSet(prefix+"SELECT ?s where { <" + subjectURI + "> <http://www.geonames.org/ontology#wikipediaArticle> ?s } ");
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				wikipediaArticle = sol.get("?s").toString();
				return EVAL_BODY_INCLUDE;
			}
		} catch (Exception e) {
			log.error("Exception raised in GeonamesFeatureIterator doStartTag", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GeonamesFeatureIterator doStartTag");
		}

		return SKIP_BODY;
	}

	public int doAfterBody() throws JspException {
		try {
			if(rs.hasNext()) {
				QuerySolution sol = rs.nextSolution();
				wikipediaArticle = sol.get("?s").toString();
				return EVAL_BODY_AGAIN;
			}
		} catch (Exception e) {
			log.error("Exception raised in GeonamesFeatureIterator doAfterBody", e);
			clearServiceState();
			freeConnection();
			throw new JspTagException("Exception raised in GeonamesFeatureIterator doAfterBody");
		}

		return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in GeonamesFeature doEndTag", e);
			throw new JspTagException("Exception raised in GeonamesFeature doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setWikipediaArticle(String wikipediaArticle) {
		this.wikipediaArticle = wikipediaArticle;
	}

	public String getWikipediaArticle() {
		return wikipediaArticle;
	}

}
