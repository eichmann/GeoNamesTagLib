package edu.uiowa.slis.GeoNames.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Person extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static Person currentInstance = null;
	private static final Log log = LogFactory.getLog(Person.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

	String surname = null;
	String firstName = null;
	String schoolHomepage = null;
	String pastProject = null;
	String geekcode = null;
	String familyName = null;
	String lastName = null;
	String myersBriggs = null;
	String img = null;
	String publications = null;
	String plan = null;
	String workplaceHomepage = null;
	String knows = null;
	String family_name = null;
	String workInfoHomepage = null;
	String currentProject = null;
	String openid = null;
	String icqChatID = null;
	String msnChatID = null;
	String weblog = null;
	String account = null;
	String interest = null;
	String mbox_sha1sum = null;
	String made = null;
	String tipjar = null;
	String age = null;
	String aimChatID = null;
	String gender = null;
	String yahooChatID = null;
	String holdsAccount = null;
	String jabberID = null;
	String topic_interest = null;
	String skypeID = null;
	String birthday = null;
	String status = null;
	String mbox = null;
	String long = null;
	String based_near = null;
	String lat = null;
	String alt = null;

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			PersonIterator thePersonIterator = (PersonIterator) findAncestorWithClass(this, PersonIterator.class);

			if (thePersonIterator != null) {
				subjectURI = thePersonIterator.getSubjectURI();
				label = thePersonIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Person.PersonKnowsIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Person.PersonKnowsIterator)this.getParent()).getKnows();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Document.DocumentSchoolHomepageInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Document.DocumentSchoolHomepageInverseIterator)this.getParent()).getSchoolHomepageInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingPastProjectInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingPastProjectInverseIterator)this.getParent()).getPastProjectInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Image.ImageImgInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Image.ImageImgInverseIterator)this.getParent()).getImgInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Document.DocumentPublicationsInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Document.DocumentPublicationsInverseIterator)this.getParent()).getPublicationsInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Document.DocumentWorkplaceHomepageInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Document.DocumentWorkplaceHomepageInverseIterator)this.getParent()).getWorkplaceHomepageInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Document.DocumentWorkInfoHomepageInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Document.DocumentWorkInfoHomepageInverseIterator)this.getParent()).getWorkInfoHomepageInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingCurrentProjectInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingCurrentProjectInverseIterator)this.getParent()).getCurrentProjectInverse();
			}

			edu.uiowa.slis.GeoNames.Person.PersonKnowsIterator thePersonKnowsIterator = (edu.uiowa.slis.GeoNames.Person.PersonKnowsIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Person.PersonKnowsIterator.class);

			if (subjectURI == null && thePersonKnowsIterator != null) {
				subjectURI = thePersonKnowsIterator.getKnows();
			}

			if (thePersonIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?surname ?firstName ?schoolHomepage ?pastProject ?geekcode ?familyName ?lastName ?myersBriggs ?img ?publications ?plan ?workplaceHomepage ?knows ?family_name ?workInfoHomepage ?currentProject ?openid ?icqChatID ?msnChatID ?weblog ?account ?interest ?mbox_sha1sum ?made ?tipjar ?age ?aimChatID ?gender ?yahooChatID ?holdsAccount ?jabberID ?topic_interest ?skypeID ?birthday ?status ?mbox ?long ?based_near ?lat ?alt where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/surname> ?surname } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/firstName> ?firstName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/schoolHomepage> ?schoolHomepage } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/pastProject> ?pastProject } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/geekcode> ?geekcode } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/familyName> ?familyName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/lastName> ?lastName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/myersBriggs> ?myersBriggs } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/img> ?img } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/publications> ?publications } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/plan> ?plan } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/workplaceHomepage> ?workplaceHomepage } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/knows> ?knows } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/family_name> ?family_name } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/workInfoHomepage> ?workInfoHomepage } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/currentProject> ?currentProject } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/openid> ?openid } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/icqChatID> ?icqChatID } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/msnChatID> ?msnChatID } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/weblog> ?weblog } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/account> ?account } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/interest> ?interest } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/mbox_sha1sum> ?mbox_sha1sum } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/made> ?made } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/tipjar> ?tipjar } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/age> ?age } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/aimChatID> ?aimChatID } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/gender> ?gender } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/yahooChatID> ?yahooChatID } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/holdsAccount> ?holdsAccount } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/jabberID> ?jabberID } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/topic_interest> ?topic_interest } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/skypeID> ?skypeID } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/birthday> ?birthday } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/status> ?status } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/mbox> ?mbox } "
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
					surname = sol.get("?surname") == null ? null : sol.get("?surname").toString();
					firstName = sol.get("?firstName") == null ? null : sol.get("?firstName").toString();
					schoolHomepage = sol.get("?schoolHomepage") == null ? null : sol.get("?schoolHomepage").toString();
					pastProject = sol.get("?pastProject") == null ? null : sol.get("?pastProject").toString();
					geekcode = sol.get("?geekcode") == null ? null : sol.get("?geekcode").toString();
					familyName = sol.get("?familyName") == null ? null : sol.get("?familyName").toString();
					lastName = sol.get("?lastName") == null ? null : sol.get("?lastName").toString();
					myersBriggs = sol.get("?myersBriggs") == null ? null : sol.get("?myersBriggs").toString();
					img = sol.get("?img") == null ? null : sol.get("?img").toString();
					publications = sol.get("?publications") == null ? null : sol.get("?publications").toString();
					plan = sol.get("?plan") == null ? null : sol.get("?plan").toString();
					workplaceHomepage = sol.get("?workplaceHomepage") == null ? null : sol.get("?workplaceHomepage").toString();
					knows = sol.get("?knows") == null ? null : sol.get("?knows").toString();
					family_name = sol.get("?family_name") == null ? null : sol.get("?family_name").toString();
					workInfoHomepage = sol.get("?workInfoHomepage") == null ? null : sol.get("?workInfoHomepage").toString();
					currentProject = sol.get("?currentProject") == null ? null : sol.get("?currentProject").toString();
					openid = sol.get("?openid") == null ? null : sol.get("?openid").toString();
					icqChatID = sol.get("?icqChatID") == null ? null : sol.get("?icqChatID").toString();
					msnChatID = sol.get("?msnChatID") == null ? null : sol.get("?msnChatID").toString();
					weblog = sol.get("?weblog") == null ? null : sol.get("?weblog").toString();
					account = sol.get("?account") == null ? null : sol.get("?account").toString();
					interest = sol.get("?interest") == null ? null : sol.get("?interest").toString();
					mbox_sha1sum = sol.get("?mbox_sha1sum") == null ? null : sol.get("?mbox_sha1sum").toString();
					made = sol.get("?made") == null ? null : sol.get("?made").toString();
					tipjar = sol.get("?tipjar") == null ? null : sol.get("?tipjar").toString();
					age = sol.get("?age") == null ? null : sol.get("?age").toString();
					aimChatID = sol.get("?aimChatID") == null ? null : sol.get("?aimChatID").toString();
					gender = sol.get("?gender") == null ? null : sol.get("?gender").toString();
					yahooChatID = sol.get("?yahooChatID") == null ? null : sol.get("?yahooChatID").toString();
					holdsAccount = sol.get("?holdsAccount") == null ? null : sol.get("?holdsAccount").toString();
					jabberID = sol.get("?jabberID") == null ? null : sol.get("?jabberID").toString();
					topic_interest = sol.get("?topic_interest") == null ? null : sol.get("?topic_interest").toString();
					skypeID = sol.get("?skypeID") == null ? null : sol.get("?skypeID").toString();
					birthday = sol.get("?birthday") == null ? null : sol.get("?birthday").toString();
					status = sol.get("?status") == null ? null : sol.get("?status").toString();
					mbox = sol.get("?mbox") == null ? null : sol.get("?mbox").toString();
					long = sol.get("?long") == null ? null : sol.get("?long").toString();
					based_near = sol.get("?based_near") == null ? null : sol.get("?based_near").toString();
					lat = sol.get("?lat") == null ? null : sol.get("?lat").toString();
					alt = sol.get("?alt") == null ? null : sol.get("?alt").toString();
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Person doStartTag", e);
			throw new JspTagException("Exception raised in Person doStartTag");
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
			log.error("Exception raised in Person doEndTag", e);
			throw new JspTagException("Exception raised in Person doEndTag");
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

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setSchoolHomepage(String schoolHomepage) {
		this.schoolHomepage = schoolHomepage;
	}

	public String getSchoolHomepage() {
		return schoolHomepage;
	}

	public void setPastProject(String pastProject) {
		this.pastProject = pastProject;
	}

	public String getPastProject() {
		return pastProject;
	}

	public void setGeekcode(String geekcode) {
		this.geekcode = geekcode;
	}

	public String getGeekcode() {
		return geekcode;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setMyersBriggs(String myersBriggs) {
		this.myersBriggs = myersBriggs;
	}

	public String getMyersBriggs() {
		return myersBriggs;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getImg() {
		return img;
	}

	public void setPublications(String publications) {
		this.publications = publications;
	}

	public String getPublications() {
		return publications;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getPlan() {
		return plan;
	}

	public void setWorkplaceHomepage(String workplaceHomepage) {
		this.workplaceHomepage = workplaceHomepage;
	}

	public String getWorkplaceHomepage() {
		return workplaceHomepage;
	}

	public void setKnows(String knows) {
		this.knows = knows;
	}

	public String getKnows() {
		return knows;
	}

	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}

	public String getFamily_name() {
		return family_name;
	}

	public void setWorkInfoHomepage(String workInfoHomepage) {
		this.workInfoHomepage = workInfoHomepage;
	}

	public String getWorkInfoHomepage() {
		return workInfoHomepage;
	}

	public void setCurrentProject(String currentProject) {
		this.currentProject = currentProject;
	}

	public String getCurrentProject() {
		return currentProject;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getOpenid() {
		return openid;
	}

	public void setIcqChatID(String icqChatID) {
		this.icqChatID = icqChatID;
	}

	public String getIcqChatID() {
		return icqChatID;
	}

	public void setMsnChatID(String msnChatID) {
		this.msnChatID = msnChatID;
	}

	public String getMsnChatID() {
		return msnChatID;
	}

	public void setWeblog(String weblog) {
		this.weblog = weblog;
	}

	public String getWeblog() {
		return weblog;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAccount() {
		return account;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getInterest() {
		return interest;
	}

	public void setMbox_sha1sum(String mbox_sha1sum) {
		this.mbox_sha1sum = mbox_sha1sum;
	}

	public String getMbox_sha1sum() {
		return mbox_sha1sum;
	}

	public void setMade(String made) {
		this.made = made;
	}

	public String getMade() {
		return made;
	}

	public void setTipjar(String tipjar) {
		this.tipjar = tipjar;
	}

	public String getTipjar() {
		return tipjar;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAge() {
		return age;
	}

	public void setAimChatID(String aimChatID) {
		this.aimChatID = aimChatID;
	}

	public String getAimChatID() {
		return aimChatID;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setYahooChatID(String yahooChatID) {
		this.yahooChatID = yahooChatID;
	}

	public String getYahooChatID() {
		return yahooChatID;
	}

	public void setHoldsAccount(String holdsAccount) {
		this.holdsAccount = holdsAccount;
	}

	public String getHoldsAccount() {
		return holdsAccount;
	}

	public void setJabberID(String jabberID) {
		this.jabberID = jabberID;
	}

	public String getJabberID() {
		return jabberID;
	}

	public void setTopic_interest(String topic_interest) {
		this.topic_interest = topic_interest;
	}

	public String getTopic_interest() {
		return topic_interest;
	}

	public void setSkypeID(String skypeID) {
		this.skypeID = skypeID;
	}

	public String getSkypeID() {
		return skypeID;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setMbox(String mbox) {
		this.mbox = mbox;
	}

	public String getMbox() {
		return mbox;
	}

	public void setLong(String long) {
		this.long = long;
	}

	public String getLong() {
		return long;
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
