package edu.uiowa.slis.GeoNames.Concept;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Concept extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static Concept currentInstance = null;
	private static final Log log = LogFactory.getLog(Concept.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String semanticRelation = null;
	String focus = null;
	String topConceptOf = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			ConceptIterator theConceptIterator = (ConceptIterator) findAncestorWithClass(this, ConceptIterator.class);

			if (theConceptIterator != null) {
				subjectURI = theConceptIterator.getSubjectURI();
				label = theConceptIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Concept.ConceptSemanticRelationIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Concept.ConceptSemanticRelationIterator)this.getParent()).getSemanticRelation();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Asset.AssetInteroperabilityLevelIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Asset.AssetInteroperabilityLevelIterator)this.getParent()).getInteroperabilityLevel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.ConceptScheme.ConceptSchemeHasTopConceptIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.ConceptScheme.ConceptSchemeHasTopConceptIterator)this.getParent()).getHasTopConcept();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Collection.CollectionMemberIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Collection.CollectionMemberIterator)this.getParent()).getMember();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingFocusInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingFocusInverseIterator)this.getParent()).getFocusInverse();
			}

			edu.uiowa.slis.GeoNames.Concept.ConceptSemanticRelationIterator theConceptSemanticRelationIterator = (edu.uiowa.slis.GeoNames.Concept.ConceptSemanticRelationIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Concept.ConceptSemanticRelationIterator.class);

			if (subjectURI == null && theConceptSemanticRelationIterator != null) {
				subjectURI = theConceptSemanticRelationIterator.getSemanticRelation();
			}

			edu.uiowa.slis.GeoNames.Asset.AssetInteroperabilityLevelIterator theAssetInteroperabilityLevelIterator = (edu.uiowa.slis.GeoNames.Asset.AssetInteroperabilityLevelIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Asset.AssetInteroperabilityLevelIterator.class);

			if (subjectURI == null && theAssetInteroperabilityLevelIterator != null) {
				subjectURI = theAssetInteroperabilityLevelIterator.getInteroperabilityLevel();
			}

			edu.uiowa.slis.GeoNames.ConceptScheme.ConceptSchemeHasTopConceptIterator theConceptSchemeHasTopConceptIterator = (edu.uiowa.slis.GeoNames.ConceptScheme.ConceptSchemeHasTopConceptIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.ConceptScheme.ConceptSchemeHasTopConceptIterator.class);

			if (subjectURI == null && theConceptSchemeHasTopConceptIterator != null) {
				subjectURI = theConceptSchemeHasTopConceptIterator.getHasTopConcept();
			}

			edu.uiowa.slis.GeoNames.Collection.CollectionMemberIterator theCollectionMemberIterator = (edu.uiowa.slis.GeoNames.Collection.CollectionMemberIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Collection.CollectionMemberIterator.class);

			if (subjectURI == null && theCollectionMemberIterator != null) {
				subjectURI = theCollectionMemberIterator.getMember();
			}

			if (theConceptIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?semanticRelation ?focus ?topConceptOf where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2004/02/skos/core#semanticRelation> ?semanticRelation } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/focus> ?focus } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2004/02/skos/core#topConceptOf> ?topConceptOf } "
				+ "}");
				while(rs.hasNext()) {
					QuerySolution sol = rs.nextSolution();
					label = sol.get("?label") == null ? null : sol.get("?label").asLiteral().getString();
					if (label == null)
						label = sol.get("?foafName") == null ? null : sol.get("?foafName").asLiteral().getString();
					if (label == null)
						label = sol.get("?schemaName") == null ? null : sol.get("?schemaName").asLiteral().getString();
					if (label == null)
						label = sol.get("?rdfValue") == null ? null : sol.get("?rdfValue").asLiteral().getString();
					semanticRelation = sol.get("?semanticRelation") == null ? null : sol.get("?semanticRelation").toString();
					focus = sol.get("?focus") == null ? null : sol.get("?focus").toString();
					topConceptOf = sol.get("?topConceptOf") == null ? null : sol.get("?topConceptOf").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Concept doStartTag", e);
			throw new JspTagException("Exception raised in Concept doStartTag");
		} finally {
			freeConnection();
		}

		return EVAL_PAGE;
	}

	public int doEndTag() throws JspException {
		currentInstance = null;
		try {
			// do processing
		} catch (Exception e) {
			log.error("Exception raised in Concept doEndTag", e);
			throw new JspTagException("Exception raised in Concept doEndTag");
		} finally {
			clearServiceState();
			freeConnection();
		}

		return super.doEndTag();
	}

	private void clearServiceState() {
		subjectURI = null;
	}

	public void setSubjectURI(String subjectURI) {
		this.subjectURI = subjectURI;
	}

	public String getSubjectURI() {
		return subjectURI;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setSemanticRelation(String semanticRelation) {
		this.semanticRelation = semanticRelation;
	}

	public String getSemanticRelation() {
		return semanticRelation;
	}

	public void setFocus(String focus) {
		this.focus = focus;
	}

	public String getFocus() {
		return focus;
	}

	public void setTopConceptOf(String topConceptOf) {
		this.topConceptOf = topConceptOf;
	}

	public String getTopConceptOf() {
		return topConceptOf;
	}

}
