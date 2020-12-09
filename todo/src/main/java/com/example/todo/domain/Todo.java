package com.example.todo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Todo {

	// @Generates unique primary key for every new entity object
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String task;
	private Date dateCreated;
	private Date dueDate;
	private String note;

	@Column(unique = true)
	private boolean completed;

	@CreatedDate
	private Date createdDate;

	@CreatedBy
	private String createdBy;


//	@ManyToOne
//	@JsonIgnore
// // JoinColumn Annotation defines the owner of the relationship. Here it means
// // categoryId is the primary key of the Category table.
//	@JoinColumn(name = "categoryId")  
//	private Category category;

	public Todo() {
	}

	public Todo(String task) {
		super();
		this.task = task;

	}
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

//	public String getCategoty() {
//		return categoty;
//	}
//
//	public void setCategoty(String categoty) {
//		this.categoty = categoty;
//	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Boolean getIsCompleted() {
		return completed;
	}

	public void setIsCompleted(Boolean isCompleted) {
		this.completed = isCompleted;
	}

}
