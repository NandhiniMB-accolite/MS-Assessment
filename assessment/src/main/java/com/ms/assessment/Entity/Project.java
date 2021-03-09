package com.ms.assessment.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Project {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column
private String name;

@Column 
private String description;

@ManyToOne
private User creator;

@ManyToOne
private Course course;

@Column
private Date createdOn;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public User getCreator() {
	return creator;
}

public void setCreator(User creator) {
	this.creator = creator;
}

public Course getCourse() {
	return course;
}

public void setCourse(Course course) {
	this.course = course;
}

public Date getCreatedOn() {
	return createdOn;
}

public void setCreatedOn(Date createdOn) {
	this.createdOn = createdOn;
}




}
