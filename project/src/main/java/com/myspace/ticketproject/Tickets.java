package com.myspace.ticketproject;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Tickets implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Type")
	private java.lang.String ticketTypes;
	@org.kie.api.definition.type.Label("Category")
	private java.lang.String ticketCategory;
	@org.kie.api.definition.type.Label("Sub Category")
	private java.lang.String ticketSubCategory;
	@org.kie.api.definition.type.Label("Priority")
	private java.lang.String ticketPriority;
	@org.kie.api.definition.type.Label("Subject")
	private java.lang.String ticketSubject;
	@org.kie.api.definition.type.Label("Description")
	private java.lang.String ticketDescription;
	@org.kie.api.definition.type.Label("Status")
	private String ticketStatus;
	@org.kie.api.definition.type.Label("Assigned")
	private java.lang.String ticketAssigned;
	@org.kie.api.definition.type.Label("Entered Date")
	private java.util.Date ticketEnteredDate;

	@org.kie.api.definition.type.Label("Id")
	private java.lang.String id;

	@org.kie.api.definition.type.Label("Updated Date")
	private java.util.Date ticketUpdateAt;

	@org.kie.api.definition.type.Label("Entered By")
	private java.lang.String ticketCreatedBy;

	@org.kie.api.definition.type.Label("Updated By")
	private java.lang.String ticketUpdatedBy;

	@org.kie.api.definition.type.Label("Process Instance Id")
	private long ticketProcessInstanceId;

	public Tickets() {
	}

	public java.lang.String getTicketTypes() {
		return this.ticketTypes;
	}

	public void setTicketTypes(java.lang.String ticketTypes) {
		this.ticketTypes = ticketTypes;
	}

	public java.lang.String getTicketCategory() {
		return this.ticketCategory;
	}

	public void setTicketCategory(java.lang.String ticketCategory) {
		this.ticketCategory = ticketCategory;
	}

	public java.lang.String getTicketSubCategory() {
		return this.ticketSubCategory;
	}

	public void setTicketSubCategory(java.lang.String ticketSubCategory) {
		this.ticketSubCategory = ticketSubCategory;
	}

	public java.lang.String getTicketPriority() {
		return this.ticketPriority;
	}

	public void setTicketPriority(java.lang.String ticketPriority) {
		this.ticketPriority = ticketPriority;
	}

	public java.lang.String getTicketSubject() {
		return this.ticketSubject;
	}

	public void setTicketSubject(java.lang.String ticketSubject) {
		this.ticketSubject = ticketSubject;
	}

	public java.lang.String getTicketDescription() {
		return this.ticketDescription;
	}

	public void setTicketDescription(java.lang.String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}

	public java.lang.String getTicketAssigned() {
		return this.ticketAssigned;
	}

	public void setTicketAssigned(java.lang.String ticketAssigned) {
		this.ticketAssigned = ticketAssigned;
	}

	public java.util.Date getTicketEnteredDate() {
		return this.ticketEnteredDate;
	}

	public void setTicketEnteredDate(java.util.Date ticketEnteredDate) {
		this.ticketEnteredDate = ticketEnteredDate;
	}

	public java.lang.String getTicketStatus() {
		return this.ticketStatus;
	}

	public void setTicketStatus(java.lang.String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.util.Date getTicketUpdateAt() {
		return this.ticketUpdateAt;
	}

	public void setTicketUpdateAt(java.util.Date ticketUpdateAt) {
		this.ticketUpdateAt = ticketUpdateAt;
	}

	public java.lang.String getTicketCreatedBy() {
		return this.ticketCreatedBy;
	}

	public void setTicketCreatedBy(java.lang.String ticketCreatedBy) {
		this.ticketCreatedBy = ticketCreatedBy;
	}

	public java.lang.String getTicketUpdatedBy() {
		return this.ticketUpdatedBy;
	}

	public void setTicketUpdatedBy(java.lang.String ticketUpdatedBy) {
		this.ticketUpdatedBy = ticketUpdatedBy;
	}

	public long getTicketProcessInstanceId() {
		return this.ticketProcessInstanceId;
	}

	public void setTicketProcessInstanceId(long ticketProcessInstanceId) {
		this.ticketProcessInstanceId = ticketProcessInstanceId;
	}

	public Tickets(java.lang.String ticketTypes,
			java.lang.String ticketCategory,
			java.lang.String ticketSubCategory,
			java.lang.String ticketPriority, java.lang.String ticketSubject,
			java.lang.String ticketDescription, java.lang.String ticketStatus,
			java.lang.String ticketAssigned, java.util.Date ticketEnteredDate,
			java.lang.String id, java.util.Date ticketUpdateAt,
			java.lang.String ticketCreatedBy, java.lang.String ticketUpdatedBy,
			long ticketProcessInstanceId) {
		this.ticketTypes = ticketTypes;
		this.ticketCategory = ticketCategory;
		this.ticketSubCategory = ticketSubCategory;
		this.ticketPriority = ticketPriority;
		this.ticketSubject = ticketSubject;
		this.ticketDescription = ticketDescription;
		this.ticketStatus = ticketStatus;
		this.ticketAssigned = ticketAssigned;
		this.ticketEnteredDate = ticketEnteredDate;
		this.id = id;
		this.ticketUpdateAt = ticketUpdateAt;
		this.ticketCreatedBy = ticketCreatedBy;
		this.ticketUpdatedBy = ticketUpdatedBy;
		this.ticketProcessInstanceId = ticketProcessInstanceId;
	}

}