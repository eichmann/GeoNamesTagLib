package edu.uiowa.slis.GeoNames.Agent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

import org.apache.jena.query.QuerySolution;
import org.apache.jena.query.ResultSet;

@SuppressWarnings("serial")
public class Agent extends edu.uiowa.slis.GeoNames.TagLibSupport {
	static Agent currentInstance = null;
	private static final Log log = LogFactory.getLog(Agent.class);

	// 'standard' properties

	String subjectURI = null;
	String label = null;
	boolean commitNeeded = false;

	// functional datatype properties, both local and inherited

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

	public int doStartTag() throws JspException {
		currentInstance = this;
		try {
			AgentIterator theAgentIterator = (AgentIterator) findAncestorWithClass(this, AgentIterator.class);

			if (theAgentIterator != null) {
				subjectURI = theAgentIterator.getSubjectURI();
				label = theAgentIterator.getLabel();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Group.GroupMemberIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Group.GroupMemberIterator)this.getParent()).getMember();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingMakerIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingMakerIterator)this.getParent()).getMaker();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Document.DocumentOpenidInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Document.DocumentOpenidInverseIterator)this.getParent()).getOpenidInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Document.DocumentWeblogInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Document.DocumentWeblogInverseIterator)this.getParent()).getWeblogInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.OnlineAccount.OnlineAccountAccountInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.OnlineAccount.OnlineAccountAccountInverseIterator)this.getParent()).getAccountInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Document.DocumentInterestInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Document.DocumentInterestInverseIterator)this.getParent()).getInterestInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Document.DocumentTipjarInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Document.DocumentTipjarInverseIterator)this.getParent()).getTipjarInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.OnlineAccount.OnlineAccountHoldsAccountInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.OnlineAccount.OnlineAccountHoldsAccountInverseIterator)this.getParent()).getHoldsAccountInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingTopic_interestInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingTopic_interestInverseIterator)this.getParent()).getTopic_interestInverse();
			}

			if (this.getParent() instanceof edu.uiowa.slis.GeoNames.Thing.ThingMboxInverseIterator) {
				subjectURI = ((edu.uiowa.slis.GeoNames.Thing.ThingMboxInverseIterator)this.getParent()).getMboxInverse();
			}

			edu.uiowa.slis.GeoNames.Group.GroupMemberIterator theGroupMemberIterator = (edu.uiowa.slis.GeoNames.Group.GroupMemberIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Group.GroupMemberIterator.class);

			if (subjectURI == null && theGroupMemberIterator != null) {
				subjectURI = theGroupMemberIterator.getMember();
			}

			edu.uiowa.slis.GeoNames.Thing.ThingMakerIterator theThingMakerIterator = (edu.uiowa.slis.GeoNames.Thing.ThingMakerIterator) findAncestorWithClass(this, edu.uiowa.slis.GeoNames.Thing.ThingMakerIterator.class);

			if (subjectURI == null && theThingMakerIterator != null) {
				subjectURI = theThingMakerIterator.getMaker();
			}

			if (theAgentIterator == null && subjectURI == null) {
				throw new JspException("subject URI generation currently not supported");
			} else {
				ResultSet rs = getResultSet(prefix
				+ " SELECT ?label ?foafName ?schemaName ?rdfValue  ?openid ?icqChatID ?msnChatID ?weblog ?account ?interest ?mbox_sha1sum ?made ?tipjar ?age ?aimChatID ?gender ?yahooChatID ?holdsAccount ?jabberID ?topic_interest ?skypeID ?birthday ?status ?mbox where {"
				+ "  OPTIONAL { <" + subjectURI + "> rdfs:label ?label } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://xmlns.com/foaf/0.1/name> ?foafName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://schema.org/name> ?schemaName } "
				+ "  OPTIONAL { <" + subjectURI + "> <http://www.w3.org/1999/02/22-rdf-syntax-ns#value> ?rdfValue } "
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
				}
			}
		} catch (Exception e) {
			log.error("Exception raised in Agent doStartTag", e);
			throw new JspTagException("Exception raised in Agent doStartTag");
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
			log.error("Exception raised in Agent doEndTag", e);
			throw new JspTagException("Exception raised in Agent doEndTag");
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

}
