package com.myspace.ticketproject;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class EmailObject implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Subject")
	private java.lang.String emailSubject;
	@org.kie.api.definition.type.Label(value = "Body")
	private java.lang.String emailBody;
	@org.kie.api.definition.type.Label(value = "Email From")
	private java.lang.String emailFrom;
	@org.kie.api.definition.type.Label(value = "Email To")
	private java.lang.String emailTo;

	public EmailObject() {
	}

	public java.lang.String getEmailSubject() {
		return this.emailSubject;
	}

	public void setEmailSubject(java.lang.String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public java.lang.String getEmailBody() {
		return this.emailBody;
	}

	public void setEmailBody(java.lang.String emailBody) {
		this.emailBody = emailBody;
	}

	public java.lang.String getEmailFrom() {
		return this.emailFrom;
	}

	public void setEmailFrom(java.lang.String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public java.lang.String getEmailTo() {
		return this.emailTo;
	}

	public void setEmailTo(java.lang.String emailTo) {
		this.emailTo = emailTo;
	}

	public EmailObject(java.lang.String emailSubject,
			java.lang.String emailBody, java.lang.String emailFrom,
			java.lang.String emailTo) {
		this.emailSubject = emailSubject;
		this.emailBody = emailBody;
		this.emailFrom = emailFrom;
		this.emailTo = emailTo;
	}

}