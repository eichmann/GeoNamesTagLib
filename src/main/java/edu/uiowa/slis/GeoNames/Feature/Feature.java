package edu.uiowa.slis.GeoNames.Feature;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Feature extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static Feature currentInstance = null;
	private static final Log log = LogFactory.getLog(Feature.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String locationMap = null;
	String neighbour = null;
	String featureClass = null;
	String neighbouringFeatures = null;
	String parentADM4 = null;
	String parentFeature = null;
	String parentADM1 = null;
	String parentADM3 = null;
	String nearby = null;
	String wikipediaArticle = null;
	String parentCountry = null;
	String nearbyFeatures = null;
	String featureCode = null;
	String parentADM2 = null;
	String childrenFeatures = null;
	String alternateName = null;
	String population = null;
	String shortName = null;
	String name = null;
	String countryCode = null;
	String postalCode = null;
	String officialName = null;
	String lng = null;
	String based_near = null;
	String lat = null;
	String alt = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			FeatureIterator theFeatureIterator = (FeatureIterator) findAncestorWithClass(this, FeatureIterator.class);

			if (theFeatureIterator != null) {
				subjectURI = theFeatureIterator.getSubjectURI();
				label = theFeatureIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Feature.FeatureNeighbourIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Feature.FeatureNeighbourIterator)this.getParent()).getNeighbour();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Feature.FeatureParentFeatureIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Feature.FeatureParentFeatureIterator)this.getParent()).getParentFeature();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Feature.FeatureNearbyIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Feature.FeatureNearbyIterator)this.getParent()).getNearby();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Map.MapLocationMapInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Map.MapLocationMapInverseIterator)this.getParent()).getLocationMapInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Class.ClassFeatureClassInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Class.ClassFeatureClassInverseIterator)this.getParent()).getFeatureClassInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.RDFData.RDFDataNeighbouringFeaturesInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.RDFData.RDFDataNeighbouringFeaturesInverseIterator)this.getParent()).getNeighbouringFeaturesInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.WikipediaArticle.WikipediaArticleWikipediaArticleInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.WikipediaArticle.WikipediaArticleWikipediaArticleInverseIterator)this.getParent()).getWikipediaArticleInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.RDFData.RDFDataNearbyFeaturesInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.RDFData.RDFDataNearbyFeaturesInverseIterator)this.getParent()).getNearbyFeaturesInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Code.CodeFeatureCodeInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Code.CodeFeatureCodeInverseIterator)this.getParent()).getFeatureCodeInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.RDFData.RDFDataChildrenFeaturesInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.RDFData.RDFDataChildrenFeaturesInverseIterator)this.getParent()).getChildrenFeaturesInverse();
			}

			edu.uiowa.slis.GeoNames.Feature.FeatureNeighbourIterator theFeatureNeighbourIterator = (edu.uiowa.slis.GeoNames.Feature.FeatureNeighbourIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Feature.FeatureNeighbourIterator.class);

			if (subjectURI == null && theFeatureNeighbourIterator != null) {
				subjectURI = theFeatureNeighbourIterator.getNeighbour();
			}

			edu.uiowa.slis.GeoNames.Feature.FeatureParentFeatureIterator theFeatureParentFeatureIterator = (edu.uiowa.slis.GeoNames.Feature.FeatureParentFeatureIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Feature.FeatureParentFeatureIterator.class);

			if (subjectURI == null && theFeatureParentFeatureIterator != null) {
				subjectURI = theFeatureParentFeatureIterator.getParentFeature();
			}

			edu.uiowa.slis.GeoNames.Feature.FeatureNearbyIterator theFeatureNearbyIterator = (edu.uiowa.slis.GeoNames.Feature.FeatureNearbyIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Feature.FeatureNearbyIterator.class);

			if (subjectURI == null && theFeatureNearbyIterator != null) {
				subjectURI = theFeatureNearbyIterator.getNearby();
			}

			if (theFeatureIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?locationMap ?neighbour ?featureClass ?neighbouringFeatures ?parentADM4 ?parentFeature ?parentADM1 ?parentADM3 ?nearby ?wikipediaArticle ?parentCountry ?nearbyFeatures ?featureCode ?parentADM2 ?childrenFeatures ?alternateName ?population ?shortName ?name ?countryCode ?postalCode ?officialName ?long ?based_near ?lat ?alt where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#locationMap> ?locationMap } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#neighbour> ?neighbour } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#featureClass> ?featureClass } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#neighbouringFeatures> ?neighbouringFeatures } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#parentADM4> ?parentADM4 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#parentFeature> ?parentFeature } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#parentADM1> ?parentADM1 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#parentADM3> ?parentADM3 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#nearby> ?nearby } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#wikipediaArticle> ?wikipediaArticle } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#parentCountry> ?parentCountry } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#nearbyFeatures> ?nearbyFeatures } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#featureCode> ?featureCode } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#parentADM2> ?parentADM2 } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#childrenFeatures> ?childrenFeatures } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#alternateName> ?alternateName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#population> ?population } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#shortName> ?shortName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#name> ?name } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#countryCode> ?countryCode } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#postalCode> ?postalCode } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.geonames.org/ontology#officialName> ?officialName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2003/01/geo/wgs84_pos#long> ?long } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/based_near> ?based_near } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2003/01/geo/wgs84_pos#lat> ?lat } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/2003/01/geo/wgs84_pos#alt> ?alt } "
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
					locationMap = sol.get("?locationMap") == null ? null : sol.get("?locationMap").toString();
					neighbour = sol.get("?neighbour") == null ? null : sol.get("?neighbour").toString();
					featureClass = sol.get("?featureClass") == null ? null : sol.get("?featureClass").toString();
					neighbouringFeatures = sol.get("?neighbouringFeatures") == null ? null : sol.get("?neighbouringFeatures").toString();
					parentADM4 = sol.get("?parentADM4") == null ? null : sol.get("?parentADM4").toString();
					parentFeature = sol.get("?parentFeature") == null ? null : sol.get("?parentFeature").toString();
					parentADM1 = sol.get("?parentADM1") == null ? null : sol.get("?parentADM1").toString();
					parentADM3 = sol.get("?parentADM3") == null ? null : sol.get("?parentADM3").toString();
					nearby = sol.get("?nearby") == null ? null : sol.get("?nearby").toString();
					wikipediaArticle = sol.get("?wikipediaArticle") == null ? null : sol.get("?wikipediaArticle").toString();
					parentCountry = sol.get("?parentCountry") == null ? null : sol.get("?parentCountry").toString();
					nearbyFeatures = sol.get("?nearbyFeatures") == null ? null : sol.get("?nearbyFeatures").toString();
					featureCode = sol.get("?featureCode") == null ? null : sol.get("?featureCode").toString();
					parentADM2 = sol.get("?parentADM2") == null ? null : sol.get("?parentADM2").toString();
					childrenFeatures = sol.get("?childrenFeatures") == null ? null : sol.get("?childrenFeatures").toString();
					alternateName = sol.get("?alternateName") == null ? null : sol.get("?alternateName").toString();
					population = sol.get("?population") == null ? null : sol.get("?population").toString();
					shortName = sol.get("?shortName") == null ? null : sol.get("?shortName").toString();
					name = sol.get("?name") == null ? null : sol.get("?name").toString();
					countryCode = sol.get("?countryCode") == null ? null : sol.get("?countryCode").toString();
					postalCode = sol.get("?postalCode") == null ? null : sol.get("?postalCode").toString();
					officialName = sol.get("?officialName") == null ? null : sol.get("?officialName").toString();
					lng = sol.get("?long") == null ? null : sol.get("?long").toString();
					based_near = sol.get("?based_near") == null ? null : sol.get("?based_near").toString();
					lat = sol.get("?lat") == null ? null : sol.get("?lat").toString();
					alt = sol.get("?alt") == null ? null : sol.get("?alt").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Feature doStartTag", e);
			throw new JspTagException("Exception raised in Feature doStartTag");
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
			log.error("Exception raised in Feature doEndTag", e);
			throw new JspTagException("Exception raised in Feature doEndTag");
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

	public void setLocationMap(String locationMap) {
		this.locationMap = locationMap;
	}

	public String getLocationMap() {
		return locationMap;
	}

	public void setNeighbour(String neighbour) {
		this.neighbour = neighbour;
	}

	public String getNeighbour() {
		return neighbour;
	}

	public void setFeatureClass(String featureClass) {
		this.featureClass = featureClass;
	}

	public String getFeatureClass() {
		return featureClass;
	}

	public void setNeighbouringFeatures(String neighbouringFeatures) {
		this.neighbouringFeatures = neighbouringFeatures;
	}

	public String getNeighbouringFeatures() {
		return neighbouringFeatures;
	}

	public void setParentADM4(String parentADM4) {
		this.parentADM4 = parentADM4;
	}

	public String getParentADM4() {
		return parentADM4;
	}

	public void setParentFeature(String parentFeature) {
		this.parentFeature = parentFeature;
	}

	public String getParentFeature() {
		return parentFeature;
	}

	public void setParentADM1(String parentADM1) {
		this.parentADM1 = parentADM1;
	}

	public String getParentADM1() {
		return parentADM1;
	}

	public void setParentADM3(String parentADM3) {
		this.parentADM3 = parentADM3;
	}

	public String getParentADM3() {
		return parentADM3;
	}

	public void setNearby(String nearby) {
		this.nearby = nearby;
	}

	public String getNearby() {
		return nearby;
	}

	public void setWikipediaArticle(String wikipediaArticle) {
		this.wikipediaArticle = wikipediaArticle;
	}

	public String getWikipediaArticle() {
		return wikipediaArticle;
	}

	public void setParentCountry(String parentCountry) {
		this.parentCountry = parentCountry;
	}

	public String getParentCountry() {
		return parentCountry;
	}

	public void setNearbyFeatures(String nearbyFeatures) {
		this.nearbyFeatures = nearbyFeatures;
	}

	public String getNearbyFeatures() {
		return nearbyFeatures;
	}

	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}

	public String getFeatureCode() {
		return featureCode;
	}

	public void setParentADM2(String parentADM2) {
		this.parentADM2 = parentADM2;
	}

	public String getParentADM2() {
		return parentADM2;
	}

	public void setChildrenFeatures(String childrenFeatures) {
		this.childrenFeatures = childrenFeatures;
	}

	public String getChildrenFeatures() {
		return childrenFeatures;
	}

	public void setAlternateName(String alternateName) {
		this.alternateName = alternateName;
	}

	public String getAlternateName() {
		return alternateName;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public String getPopulation() {
		return population;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setOfficialName(String officialName) {
		this.officialName = officialName;
	}

	public String getOfficialName() {
		return officialName;
	}

	public void setLong(String lng) {
		this.lng = lng;
	}

	public String getLong() {
		return lng;
	}

	public void setBased_near(String based_near) {
		this.based_near = based_near;
	}

	public String getBased_near() {
		return based_near;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLat() {
		return lat;
	}

	public void setAlt(String alt) {
		this.alt = alt;
	}

	public String getAlt() {
		return alt;
	}

}
