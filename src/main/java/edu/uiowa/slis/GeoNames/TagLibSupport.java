package edu.uiowa.slis.GeoNames;

import java.util.Hashtable;

import org.apache.jena.query.Dataset;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;
import org.apache.jena.query.Syntax;
import org.apache.jena.tdb.TDBFactory;

@SuppressWarnings("serial")
public class TagLibSupport extends javax.servlet.jsp.tagext.TagSupport {
	static final boolean useSPARQL = false;
	static String endpoint = "http://marengo.info-science.uiowa.edu:2021/sparql";
	static protected String prefix = 
		"PREFIX ld4l: <http://bib.ld4l.org/ontology/>"
			+ "PREFIX ld4lcornell: <http://draft.ld4l.org/cornell/>"
			+ "PREFIX madsrdf: <http://www.loc.gov/mads/rdf/v1#>"
			+ "PREFIX oa: <http://www.w3.org/ns/oa#>"
			+ "PREFIX owl: <http://www.w3.org/2002/07/owl#>"
			+ "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"
			+ "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>"
			+ "PREFIX void: <http://rdfs.org/ns/void#>"
			+ "PREFIX worldcat: <http://www.worldcat.org/oclc/>"
			+ "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>";
	static Hashtable<String, String> classNameHash = new Hashtable<String, String>();
	static Hashtable<String, String> classLocalNameHash = new Hashtable<String, String>();

	static {
		classNameHash.put("http://xmlns.com/foaf/0.1/Image", "Image");
		classNameHash.put("http://xmlns.com/foaf/0.1/Project", "Project");
		classNameHash.put("http://xmlns.com/foaf/0.1/Agent", "Agent");
		classNameHash.put("http://www.geonames.org/ontology#Code", "Code");
		classNameHash.put("http://www.geonames.org/ontology#GeonamesFeature", "GeonamesFeature");
		classNameHash.put("http://xmlns.com/foaf/0.1/LabelProperty", "LabelProperty");
		classNameHash.put("http://www.geonames.org/ontology#Map", "Map");
		classNameHash.put("http://xmlns.com/foaf/0.1/Document", "Document");
		classNameHash.put("http://www.w3.org/2002/07/owl#Thing", "Thing");
		classNameHash.put("http://www.w3.org/2004/02/skos/core#ConceptScheme", "ConceptScheme");
		classNameHash.put("http://xmlns.com/foaf/0.1/OnlineAccount", "OnlineAccount");
		classNameHash.put("http://www.w3.org/2004/02/skos/core#Collection", "Collection");
		classNameHash.put("http://www.w3.org/2004/02/skos/core#OrderedCollection", "OrderedCollection");
		classNameHash.put("http://xmlns.com/foaf/0.1/PersonalProfileDocument", "PersonalProfileDocument");
		classNameHash.put("http://xmlns.com/foaf/0.1/Person", "Person");
		classNameHash.put("http://xmlns.com/foaf/0.1/OnlineGamingAccount", "OnlineGamingAccount");
		classNameHash.put("http://www.w3.org/2002/07/owl#Nothing", "Nothing");
		classNameHash.put("http://www.geonames.org/ontology#Class", "Class");
		classNameHash.put("http://xmlns.com/foaf/0.1/OnlineChatAccount", "OnlineChatAccount");
		classNameHash.put("http://www.geonames.org/ontology#WikipediaArticle", "WikipediaArticle");
		classNameHash.put("http://www.geonames.org/ontology#RDFData", "RDFData");
		classNameHash.put("http://www.geonames.org/ontology#Feature", "Feature");
		classNameHash.put("http://xmlns.com/foaf/0.1/Group", "Group");
		classNameHash.put("http://xmlns.com/foaf/0.1/Organization", "Organization");
		classNameHash.put("http://www.w3.org/2004/02/skos/core#Concept", "Concept");
		classNameHash.put("http://xmlns.com/foaf/0.1/OnlineEcommerceAccount", "OnlineEcommerceAccount");

		classLocalNameHash.put("Image", "http://xmlns.com/foaf/0.1/Image");
		classLocalNameHash.put("Project", "http://xmlns.com/foaf/0.1/Project");
		classLocalNameHash.put("Agent", "http://xmlns.com/foaf/0.1/Agent");
		classLocalNameHash.put("Code", "http://www.geonames.org/ontology#Code");
		classLocalNameHash.put("GeonamesFeature", "http://www.geonames.org/ontology#GeonamesFeature");
		classLocalNameHash.put("LabelProperty", "http://xmlns.com/foaf/0.1/LabelProperty");
		classLocalNameHash.put("Map", "http://www.geonames.org/ontology#Map");
		classLocalNameHash.put("Document", "http://xmlns.com/foaf/0.1/Document");
		classLocalNameHash.put("Thing", "http://www.w3.org/2002/07/owl#Thing");
		classLocalNameHash.put("ConceptScheme", "http://www.w3.org/2004/02/skos/core#ConceptScheme");
		classLocalNameHash.put("OnlineAccount", "http://xmlns.com/foaf/0.1/OnlineAccount");
		classLocalNameHash.put("Collection", "http://www.w3.org/2004/02/skos/core#Collection");
		classLocalNameHash.put("OrderedCollection", "http://www.w3.org/2004/02/skos/core#OrderedCollection");
		classLocalNameHash.put("PersonalProfileDocument", "http://xmlns.com/foaf/0.1/PersonalProfileDocument");
		classLocalNameHash.put("Person", "http://xmlns.com/foaf/0.1/Person");
		classLocalNameHash.put("OnlineGamingAccount", "http://xmlns.com/foaf/0.1/OnlineGamingAccount");
		classLocalNameHash.put("Nothing", "http://www.w3.org/2002/07/owl#Nothing");
		classLocalNameHash.put("Class", "http://www.geonames.org/ontology#Class");
		classLocalNameHash.put("OnlineChatAccount", "http://xmlns.com/foaf/0.1/OnlineChatAccount");
		classLocalNameHash.put("WikipediaArticle", "http://www.geonames.org/ontology#WikipediaArticle");
		classLocalNameHash.put("RDFData", "http://www.geonames.org/ontology#RDFData");
		classLocalNameHash.put("Feature", "http://www.geonames.org/ontology#Feature");
		classLocalNameHash.put("Group", "http://xmlns.com/foaf/0.1/Group");
		classLocalNameHash.put("Organization", "http://xmlns.com/foaf/0.1/Organization");
		classLocalNameHash.put("Concept", "http://www.w3.org/2004/02/skos/core#Concept");
		classLocalNameHash.put("OnlineEcommerceAccount", "http://xmlns.com/foaf/0.1/OnlineEcommerceAccount");
	}

	Dataset dataset = null;

	public ResultSet getResultSet(String queryString) {
		if (useSPARQL) {
			Query theClassQuery = QueryFactory.create(queryString, Syntax.syntaxARQ);
			QueryExecution theClassExecution = QueryExecutionFactory.sparqlService(endpoint, theClassQuery);
			return theClassExecution.execSelect();
		} else {
			dataset = TDBFactory.createDataset("/Volumes/LD4L/geonames");
			Query query = QueryFactory.create(queryString, Syntax.syntaxARQ);
			QueryExecution qexec = QueryExecutionFactory.create(query, dataset);
			return qexec.execSelect();
		}
	}

	public void freeConnection() {
		if (!useSPARQL) {
			//dataset.close();
		}
	}

	public String getLocalName(String classString) {
		if (classString == null) {
			return null;
		}
		return classNameHash.get(classString);
	}

}
